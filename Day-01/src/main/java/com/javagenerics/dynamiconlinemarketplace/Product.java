package com.javagenerics.dynamiconlinemarketplace;
//generic class
public class Product <T extends Category>{
  private String pName;
  private double price;
  private T category;
  //constructor
  public Product(String pName, double price, T category){
      this.pName = pName;
      this.price = price;
      this.category = category;
  }
    //getter
    public String getpName(){
      return pName;
    }

    public double getPrice(){
      return price;
    }
    public T getCategory(){
    return category;
  }
  //setter
  public void setPrice(double price) {
    this.price = price;
  }
  @Override
  public String toString() {
    //to convert to string
    return "Product: " + pName + " | Price: $" + price + " | Category: " + category.getName();
  }
}
