package com.edmontheprogrammer.Dao;

import com.edmontheprogrammer.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("PostgreSQLData")
public class PostgreSQLStudentDaoImplementation implements StudentDao {

    /**
     * Step 1: create a connection to PostgreSQL database
     * Step 2: create a template class that will perform insert, delete, update, post and all the methods you want to
     *          do.
     * Step 3; Go to the Student Service class and add "@qualifier" a Spring Boot injection to
     */

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                add(new Student(1, "Mario", "History"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
