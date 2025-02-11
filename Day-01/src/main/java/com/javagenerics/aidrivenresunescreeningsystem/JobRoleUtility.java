package com.javagenerics.aidrivenresunescreeningsystem;
import java.util.List;
public class JobRoleUtility {
    //generic method with wildcard
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println("Screening: " + role.getName());
            System.out.println("Eligibility: " + (role.isEligible() ? "Accepted" : "Rejected"));
            System.out.println();
        }
    }

}
