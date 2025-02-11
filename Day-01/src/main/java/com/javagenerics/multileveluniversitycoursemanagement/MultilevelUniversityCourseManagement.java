package com.javagenerics.multileveluniversitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class MultilevelUniversityCourseManagement {
    public static void main(String[] args) {
        //creating list of course type
        List<CourseType> courseTypes = new ArrayList<>();
        //add courses to list
        courseTypes.add(new ExamCourse("Java"));
        courseTypes.add(new AssignmentCourse("C++"));
        courseTypes.add(new ResearchCourse("Maths"));

        CourseUtility.manageCourses(courseTypes);

        Course<ExamCourse> c1 = new Course<>(new ExamCourse("English"));
        c1.displayCourse();
    }
}
