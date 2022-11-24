package persistence;

import entity.Student;

import java.util.Collection;


public interface StudentDao {
    Collection<Student> getAllStudent();

    Student searchStudent (int id);
    Student addNewGrade(Student grade);
}
