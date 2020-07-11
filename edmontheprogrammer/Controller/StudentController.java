package com.edmontheprogrammer.Controller;

import com.edmontheprogrammer.Entity.Student;
import com.edmontheprogrammer.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    /**
     * The StudentController class sends the request to StudentService.
     */

    // Creating an instance of the StudentService
    @Autowired
    private StudentService studentService;

    // creating a method of Collection type with Student as the data type this collection is taking.
    // "Student" is the type of data this Collection is taking just like when we create a Collection that takes String
    // as the input data types. This method returns all the Students it's acting as the "SELECT *" statment in
    // our database.
    //Then we use the "@RequestMapping" Springboot annotation to map the HTTP requests from the client to the
    // Java functions
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {

        return studentService.getAllStudents();
    }

    // Creating a method of type Student that gets a single student using the student ID
    // The method header is creating a function that returns a Single student instead of a collection.
    // we use @requestMapping Spring Annotation to map the id to to the @PathVariable
    @RequestMapping(value = "/{id}", method =  RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {

        return studentService.getStudentById(id);
    }

    // creating a method named deleteStudentById which removes a single student from the database
    @RequestMapping( method =  RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteStudentById(@RequestBody Student student) {

        studentService.updateStudent(student);
    }

    // Creating a method named insertStudent that adds a student to the database
    @RequestMapping( method =  RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student) {

        studentService.insertStudent(student);
    }



}
