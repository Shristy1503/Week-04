package com.javagenerics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    //create list of products in new array list
    public List<Product<? extends Category>> products = new ArrayList<>();
    //add product in the list products
    public void addProduct(Product<? extends Category> product){
        products.add(product);
    }

    //display the product
    public void display(){
        for ( Product<? extends Category> product : products){
            System.out.println(product);
        }
    }
}
