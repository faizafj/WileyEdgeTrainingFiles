package service;

import entity.Student;

import java.util.Collection;

public interface StudentService {
    Collection<Student> getAllStudents(); //getAllStudents
    boolean addNewGrade(Student grade); //addNewGrade
}
