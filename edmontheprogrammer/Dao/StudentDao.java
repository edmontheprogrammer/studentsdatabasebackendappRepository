package com.edmontheprogrammer.Dao;

import com.edmontheprogrammer.Entity.Student;

import java.util.Collection;

/**
 * This is the interface for our StudentDao
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
