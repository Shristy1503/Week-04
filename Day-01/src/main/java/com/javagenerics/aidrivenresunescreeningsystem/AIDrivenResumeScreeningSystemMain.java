package com.javagenerics.aidrivenresunescreeningsystem;
import java.util.ArrayList;
import java.util.List;

public class AIDrivenResumeScreeningSystemMain {
    public static void main(String[] args) {
      //create each resume
        List<JobRole> applicants = new ArrayList<>();
        applicants.add(new SoftwareEngineer("Shristy mishra", 3));
        applicants.add(new DataScientist("Arjun Singh Chauhan", 6));
        applicants.add(new ProductManager("Nancy Mehra", 2));

        JobRoleUtility.processResumes(applicants);

    }
}
