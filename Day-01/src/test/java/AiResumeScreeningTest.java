import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.javagenerics.aidrivenresunescreeningsystem.*;
import java.util.ArrayList;
import java.util.List;
public class AiResumeScreeningTest {
  //create list
  private List<JobRole> applicants;
    @BeforeEach
    void setUp() {
        applicants = new ArrayList<>();
        applicants.add(new SoftwareEngineer("Shristy Mishra", 3));
        applicants.add(new DataScientist("Arjun Singh Chauhan", 6));
    }
    //testing for software engineer
    @Test
    void testSoftwareEngineerEligibility() {
        SoftwareEngineer se = new SoftwareEngineer("Shristy Mishra", 3);
        assertTrue(se.isEligible(), "Software Engineer with 3 years should be eligible");
    }
    //testing for data scientist
    @Test
    void testDataScientistEligibility() {
        DataScientist ds = new DataScientist("Arjun Singh Chauhan", 6);
        assertTrue(ds.isEligible(), "Data Scientist with 6 years should be eligible");
    }

    @Test
    void testResumeProcessing() {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Shristy Mishra", 3));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Arjun Singh Chauhan", 6));

        assertDoesNotThrow(seResume::processResume);
        assertDoesNotThrow(dsResume::processResume);
    }
    @Test
    void testJobRoleUtilityProcessing() {
        assertDoesNotThrow(() -> JobRoleUtility.processResumes(applicants));
    }

}
