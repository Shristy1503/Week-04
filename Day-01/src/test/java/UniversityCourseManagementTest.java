import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.javagenerics.multileveluniversitycoursemanagement.*;
import java.util.List;
import java.util.ArrayList;
public class UniversityCourseManagementTest {
    //create list to store
    private List<CourseType> courseTypes;
    private Course<ExamCourse> examCourse;
    private Course<AssignmentCourse> assignmentCourse;

    //beforeeach
    @BeforeEach
    void setUp() {
        courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse("Java"));
        courseTypes.add(new AssignmentCourse("C++"));

        examCourse = new Course<>(new ExamCourse("English"));
        assignmentCourse = new Course<>(new AssignmentCourse("Python"));

    }
    //testing to manage courses
    @Test
    void testManageCourses() {
        assertDoesNotThrow(() -> CourseUtility.manageCourses(courseTypes));
    }
   //testing to display course
    @Test
    void testDisplayExamCourse() {
        assertDoesNotThrow(() -> examCourse.displayCourse());
    }
   //testing to display assignment
    @Test
    void testDisplayAssignmentCourse() {
        assertDoesNotThrow(() -> assignmentCourse.displayCourse());
    }
}
