package com.javagenerics.multileveluniversitycoursemanagement;

public class ResearchCourse extends CourseType{
    //constructor
    public ResearchCourse(String courseName) {
        super(courseName);
    }
    //override method
    @Override
    public void display(){
        System.out.println("The is " + getCourseName() + " course");
    }
}
