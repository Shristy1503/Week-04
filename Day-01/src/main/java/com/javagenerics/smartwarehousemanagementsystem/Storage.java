package com.javagenerics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// bounded type parameter of T
public class Storage <T extends WarehouseItem>{
    //create variable of T list type
    private List<T> item = new ArrayList<>();
    //method to store items in list
    public void addItem(T items){
        item.add(items);
    }
    public List <T> getItem(){
        return item;
    }
}
