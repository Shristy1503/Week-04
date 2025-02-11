package com.javagenerics.multileveluniversitycoursemanagement;

public class AssignmentCourse extends CourseType{
    //constructor
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
    //override method
    @Override
    public void display(){
        System.out.println("The is " + getCourseName() + " course");
    }
}
