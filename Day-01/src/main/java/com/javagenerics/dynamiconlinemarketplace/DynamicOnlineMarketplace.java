package com.javagenerics.dynamiconlinemarketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
      // object of products
        Product<BookCategory> book = new Product<>("Verity", 45, new BookCategory("Book"));
        Product<ClothingCategory> cloth = new Product<>("skirt", 12, new ClothingCategory("Clothes"));

        //product catalog
        Catalog obj = new Catalog();
        obj.addProduct(book); //add book
        obj.addProduct(cloth); // add clothes

        //display product
        System.out.println("Products: ");
        obj.display();

        //discount apply
        System.out.println("Apply discount : ");
        ProductUtility.applyDiscount(book, 5);
        ProductUtility.applyDiscount(cloth, 12);

        //display after discount
        System.out.println("updated price : ");
        obj.display();
    }
}
