package com.generation.model;

import java.util.Date;
import java.util.HashMap;


public class Student extends Person
{
    public static final double PASS_MIN_GRADE = 3.0;

    private final HashMap<String, EnrolledCourse> enrolledCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public boolean enrollToCourse( Course course )
    {
        //check if course is existing already
        if (!this.enrolledCourses.containsKey(course.getCode())) {
            EnrolledCourse studentCourse = new EnrolledCourse(course); //Create new instance
            this.enrolledCourses.put(course.getCode(), studentCourse);
            return true;
        } else {
            return false;
        }
    }

    public HashMap<String, EnrolledCourse> getEnrolledCourses()
    {
        return this.enrolledCourses;
    }

    public void gradeCourse( String courseCode, double grade )
    {
        //TODO set the grade for the enrolled Course
        if (this.enrolledCourses.containsKey(courseCode)) {
            EnrolledCourse enCourse = this.enrolledCourses.get(courseCode);
            enCourse.setGrade(grade);
    }


    public Course findCourseById( String courseId)
    {
        //TODO return a Course from the course Id
        return this.getEnrolledCourses().get(courseId);

    }

    public HashMap<String, EnrolledCourse> findPassedCourses()
    {
        //TODO Check the enrolled courses grade and compare to the passing grade

       return null;
    }

    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
