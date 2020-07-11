package com.edmontheprogrammer.Entity;

public class Student {

    /**
     *  The student class represents the object with attributes that we are going to be storing in the database.
     *
     */

    // creating instance variables, attributes for student
    // Each student will have these attributes
    private int id;
    private String name;
    private String course;

    // Creating the constructor for the student class
    public Student(int id, String name, String course) {

        this.id = id;
        this.name = name;
        this.course = course;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }


}
