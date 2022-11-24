package client;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import presentation.StudentPresentation;


public class StudentClient {
    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);
        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(StudentConfiguration.class);

        StudentPresentation studentPresentation=(StudentPresentation) springContainer.getBean("presentation");
        while(true) {
            studentPresentation.showMenu();
            System.out.println("Enter your choice : ");
            int choice = userInput.nextInt();
            studentPresentation.performMenu(choice);
        }
    }
}
