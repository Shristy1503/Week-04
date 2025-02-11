package com.javagenerics.aidrivenresunescreeningsystem;

public class SoftwareEngineer extends JobRole{
    //constructor
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }
  //override method is eligible
    @Override
    public boolean isEligible() {
        return getExperience() >= 2;
    }
}
