package database;

import entity.Student;

import java.util.LinkedHashMap;
import java.util.Map;


public class Database {
    static private Map<Integer, Student> studentList = new LinkedHashMap <Integer, Student>();


    static {
        studentList.put(1, new Student(1, "Faiza", 99));
        studentList.put(2, new Student(2, "Sam", 80));
        studentList.put(3, new Student(3, "Harry", 82));
        studentList.put(4, new Student(4, "Jane", 54));


    }

    public static Map<Integer, Student> getStudentList() {

        return studentList;
    }


}
