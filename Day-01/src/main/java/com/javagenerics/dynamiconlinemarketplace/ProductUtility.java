package com.javagenerics.dynamiconlinemarketplace;

public class ProductUtility {
    public static <T extends Product> void applyDiscount(T product, double percentage){
        double amount = (product.getPrice() * percentage)/100;
        product.setPrice(product.getPrice() - amount);
        System.out.println("Discount : " + percentage + "% on " + product.getpName() + " New price: " + product.getPrice() + " $");
    }
}
