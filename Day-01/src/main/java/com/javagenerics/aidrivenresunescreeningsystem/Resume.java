package com.javagenerics.aidrivenresunescreeningsystem;
//generic class
public class Resume <T extends JobRole>{
    private T candidate;
    //constructor
    public Resume(T candidate) {
        this.candidate = candidate;
    }

    public void processResume() {
        System.out.println("Processing resume for: " + candidate.getName());
        if (candidate.isEligible()) {
            System.out.println("Candidate is eligible for the job.");
        } else {
            System.out.println("Candidate is not eligible for the job");
        }
    }
}
