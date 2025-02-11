package com.javagenerics.smartwarehousemanagementsystem;

import java.util.List;

public class WarehouseUtility {
  public void display(List<? extends WarehouseItem> item){
      //display each item in the storage
      for (WarehouseItem value : item){
          System.out.println(value.getName() + " | " + value.getPrice() + " $");

      }
  }
}
