package com.groupfour.client;

import com.groupfour.presentation.BookPresentation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class BookClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(BookConfiguration.class);
		
		BookPresentation bookPresentation=(BookPresentation)springContainer.getBean("presentation");
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			bookPresentation.performMenu(choice);
		}
	}
}
