package persistence;

import database.Database;
import entity.Student;
import java.util.Collection;


public class StudentDaoImpl implements StudentDao {

    @Override
    public Collection <Student> getAllStudent() {
        return Database.getStudentList().values();
    }

    @Override
    public Student searchStudent(int id) {
        return null;
    }

    @Override
    public Student addNewGrade(Student grade) {
        return Database.getStudentList().put(grade.getStudentId(), grade);
    }
}

