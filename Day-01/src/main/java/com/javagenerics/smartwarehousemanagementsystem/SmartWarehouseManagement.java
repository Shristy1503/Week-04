package com.javagenerics.smartwarehousemanagementsystem;

public class SmartWarehouseManagement {
    public static void main(String[] args) {
        //create storage of each generic type
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        //add items in storage of electronics type
        electronicsStorage.addItem(new Electronics("Washing machine", 299));
        electronicsStorage.addItem(new Electronics("AC", 302.9));

        //add items in storage of groceries type
        groceriesStorage.addItem(new Groceries("Apples", 23));

        //add items in storage of furniture type
        furnitureStorage.addItem(new Furniture("Table", 34));
        furnitureStorage.addItem(new Furniture("Sofa", 33.09));

        //display each item
        System.out.println("Electronic items:");
        WarehouseUtility wh = new WarehouseUtility();
        wh.display(electronicsStorage.getItem());

        System.out.println("Groceries items:");
        wh.display(groceriesStorage.getItem());

        System.out.println("Furniture items:");
        wh.display(furnitureStorage.getItem());
    }
}
