package com.javagenerics.aidrivenresunescreeningsystem;

public abstract class JobRole {
    private String name;
    private int experience;
    //constructor
    public JobRole(String candidateName, int experience) {
        this.name = candidateName;
        this.experience = experience;
    }
    //getter method
    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
   //abstract method
    public abstract boolean isEligible();

}
