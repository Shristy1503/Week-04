package com.javagenerics.multileveluniversitycoursemanagement;
import java.util.List;
public class CourseUtility {
    //generic method
    public static void manageCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.display();
        }
    }
}
