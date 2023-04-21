package com.generation.service;

import com.generation.model.Course;
import com.generation.model.EnrolledCourse;
import com.generation.model.Student;

import java.util.HashMap;

public class StudentService
{
    private final HashMap<String, Student> students = new HashMap<>();

    public void registerStudent( Student student )
    {
        // Requirement TODO Add new student to the students hashmap
        // Check if students HashMap contains students  -> else, add student
        // If student not in HashMap, put student in HashMap
        // Otherwise, say "Student already subscribed"
        if (!students.containsKey(student.getId())){    // Use Logical Not
            students.put(student.getId(), student);
            System.out.println( "Student Successfully Registered!" );
        } else {
            System.out.println("Student with that ID is already subscribed!");
        }
    }

    public Student findStudent( String studentId )
    {
        //TODO Find the student from the Hashmap with the student id
        //In the students HashMap, get the student value using studentID and return the student
        return students.get(studentId);
    }

    public boolean enrollToCourse( String studentId, Course course )
    // changed to boolean so that Main can print "Student is already registered to course" if course is already registered
    {
        //TODO check if students hashmap contains the studentsId, if not enroll student to the course
        // Use findStudent method to get the student object
        // Call the student's enrollToCourse method and pass in course
        if (this.findStudent(studentId).enrollToCourse(course)) {
            return true;
        }
        return false;
    }

    public void showSummary()
    {
        //TODO Loop through students hashmap and print out students' details including the enrolled courses

        for ( String key : students.keySet() ) //looping through the students hashmap for each key. keySet() returns a set of all the keys in the hashmap
        {
            System.out.println( students.get( key ) ); //printing out the student details
            //System.out.println( students.get( key ).getEnrolledCourses() ); //printing out the student enrolled courses
        }

    }

    public HashMap<String, EnrolledCourse> enrolledCourses(Student student)
    {
        //TODO return a HashMap of all the enrolledCourses
        HashMap<String, EnrolledCourse> enrolledCourses = new HashMap<>();
        return enrolledCourses;
    }

    public Course findEnrolledCourse( Student student, String courseId )
    {
        //TODO return the course enrolled by the student from the course Id
        //return courseId.get(student);
        return null;
    }

    public void gradeStudent(Student student, Course course, double grade) {
        student.gradeCourse(course.getCode(), grade);
    }



    public HashMap<String, EnrolledCourse> getPassedCourses(Student student) {
        return student.findPassedCourses();
    }
}
