package com.javagenerics.aidrivenresunescreeningsystem;

public class ProductManager extends JobRole{
    //constructor
    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }
    //override method is eligible
    @Override
    public boolean isEligible() {
        return getExperience() >= 5;
    }

}
