package com.edmontheprogrammer.Dao;

import com.edmontheprogrammer.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("InMemoryData")
public class InMemoryDatabaseStudentDaoImplementation implements StudentDao {

    /**
     * StudentDao is a class that gives us data from any data source we want to connect to. For example, we can use
     * this class to get data from Amazon RDS DB with PostgreSQL as DB engine or PostgreSQL database running on local
     * host. This is our DB
     */

    // creating a map, key-value pair, that representing fake database, in-memory database
    // this map stores integers as key and Student objects as values
    private static Map<Integer, Student> students;

    // creating the data for DB
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "James", "Biology"));
                put(2, new Student(2, "Tom", "English"));
                put(3, new Student(3, "Bob", "Art"));
                put(57, new Student(57, "Benson", "Business"));
            }
        };
    }

   @Override
   public Collection<Student> getAllStudents() {
        return this.students.values();
   }

   @Override
   public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {

        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudentToDb(Student student) {

       this.students.put(student.getId(), student);
    }
}
