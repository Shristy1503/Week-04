package com.javagenerics.multileveluniversitycoursemanagement;

public class ExamCourse extends CourseType{
  //consructor
  public ExamCourse(String courseName) {
      super(courseName);
  }
  //override method
    @Override
    public void display(){
        System.out.println("The is " + getCourseName() + " course");
    }
}
