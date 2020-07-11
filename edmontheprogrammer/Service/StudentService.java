package com.edmontheprogrammer.Service;

import com.edmontheprogrammer.Dao.StudentDao;
import com.edmontheprogrammer.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    /**
     * StudentService class is the service that uses the Student database, from StudentDao
     */

    // Creating an instance of the StudentDao class
    @Autowired
    @Qualifier("PostgreSQLData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }


    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student) {

     this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {

        studentDao.insertStudentToDb(student);
    }
}
