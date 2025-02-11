package com.javagenerics.multileveluniversitycoursemanagement;
//generic class
public class Course <T extends CourseType>{
    private T course;

    public Course(T course) {
        this.course = course;
    }
     //getter
    public T getCourse() {
        return course;
    }
    public void displayCourse(){
        course.display();
    }

}
