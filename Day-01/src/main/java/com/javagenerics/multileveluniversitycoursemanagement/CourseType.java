package com.javagenerics.multileveluniversitycoursemanagement;

public abstract class CourseType {
    private String courseName;
   //constructor
    public CourseType(String courseName) {
        this.courseName = courseName;
    }
   //getter
    public String getCourseName() {
        return courseName;
    }

// abstract method
    public abstract void display();
}
