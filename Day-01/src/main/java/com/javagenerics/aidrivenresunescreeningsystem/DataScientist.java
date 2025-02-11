package com.javagenerics.aidrivenresunescreeningsystem;

public class DataScientist extends JobRole{
    //constructor
    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }
    //override method is eligible
    @Override
    public boolean isEligible() {
        return getExperience() >= 3;
    }
}
