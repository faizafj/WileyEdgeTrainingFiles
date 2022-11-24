package presentation;

import entity.Student;
import service.StudentService;
import java.util.Collection;
import java.util.Scanner;

public class StudentPresentationImpl implements StudentPresentation {
    private StudentService studentService;
    public void setStudentService (StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void showMenu() {
        System.out.println("1. List all students");
        System.out.println("2. Add student grade");
        System.out.println("3. Exit");
    }

    @Override
    public void performMenu(int menuChoice) {
        Scanner scanner = new Scanner(System.in);

        switch(menuChoice) {
            case 1:
                Collection <Student> students = studentService.getAllStudents();
                for(Student student : students) {
                    System.out.println (student);
                }
                break;
            case 2:
                Student newGrades = new Student();
                System.out.println("Enter Student ID: ");
                newGrades.setStudentId(scanner.nextInt());
                System.out.println("Enter Student name: ");
                newGrades.setStudentName(scanner.next());
                System.out.println("Enter grade: ");
                newGrades.setGrade (scanner.nextInt());

                if(studentService.addNewGrade (newGrades))
                    System.out.println("Student grade has been added");
                else
                    System.out.println("Student and grades already exist");
                break;
            case 3:
                System.out.println("Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
