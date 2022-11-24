package service;

import entity.Student;
import persistence.StudentDao;

import java.util.Collection;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao; //instantiates the student dao

    public StudentServiceImpl(StudentDao studentDao) { //constructor
        super();
        this.studentDao = studentDao;
    }

    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    @Override
    public boolean addNewGrade(Student grade) {
        Student gradesToAdd = studentDao.searchStudent (grade.getStudentId());
        if (gradesToAdd != null) {
            return false;
        }
        studentDao.addNewGrade(grade);
        return true;
    }
}
