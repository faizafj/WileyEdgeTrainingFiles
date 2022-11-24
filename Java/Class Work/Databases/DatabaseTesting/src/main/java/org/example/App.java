package org.example;

import java.sql.*;
import java.util.Scanner;
import java.sql.Date;

public class App {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement;

        Scanner scanner = new Scanner(System.in);

        try {
//			1. Connect
//			1.1 Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

//			1.2 Connect to the Database
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wiley", "root", "p455w0rd");

//			2. Query
            preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEES");

            //DQL : executeQuery() , which will result ResultSet
            ResultSet resultSet = preparedStatement.executeQuery();

//			3. Process The result
            while (resultSet.next()) {
                int id = resultSet.getInt("EMPLOYEE_ID");
                String firstName = resultSet.getString("FIRST_NAME");
                String lastName = resultSet.getString("SURNAME");
                String email = resultSet.getString("EMAIL");
                String phoneNumber = resultSet.getString("PHONE_NUMBER");
                Date hireDate = resultSet.getDate("HIRE_DATE");
                int jobId = resultSet.getInt("JOB_ID");
                double sal = resultSet.getDouble("SALARY");
                double commission = resultSet.getDouble("COMMISSION_PCT");
                int managerID = resultSet.getInt("MANAGER_ID");
                int deptID = resultSet.getInt("DEPARTMENT_ID");

                //displaying result
                System.out.println(id + " | " + firstName + " | " + lastName + " | " + email + " | " + phoneNumber + " | " + hireDate
                        + " | " + jobId + " | " + sal + " | " + commission + " | " + managerID + " | " + deptID);
            }


            preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEES VALUES(?,?,?,?,?,?,?,?,?,?,?)");

            System.out.println("Enter Employee ID : ");
            preparedStatement.setInt(1, scanner.nextInt());

            System.out.println("Enter Employee First Name : ");
            preparedStatement.setString(2, scanner.next());

            System.out.println("Enter Employee Surname : ");
            preparedStatement.setString(3, scanner.next());

            System.out.println("Enter Employee email : ");
            preparedStatement.setString(4, scanner.next());

            System.out.println("Enter Employee phone number : ");
            preparedStatement.setString(5, scanner.next());

            System.out.println("Enter Employee hire date : ");
            preparedStatement.setDate(6, Date.valueOf(scanner.next()));

            System.out.println("Enter Employee Job Id: ");
            preparedStatement.setInt(7, scanner.nextInt());

            System.out.println("Enter Employee Salary: ");
            preparedStatement.setDouble(8, scanner.nextDouble());

            System.out.println("Enter Employee Commission PCT ");
            preparedStatement.setDouble(9, scanner.nextDouble());

            System.out.println("Enter Employee Department ID : ");
            preparedStatement.setInt(10, scanner.nextInt());

            System.out.println("Enter Employee Manager ID : ");
            preparedStatement.setInt(11, scanner.nextInt());

            //DML : executeUpdate() , which will int (count of no of rows manipulated by the query)
            int rows = preparedStatement.executeUpdate();

//			3. Process The result
            if (rows > 0)
                System.out.println("Employee added");
            else
                System.out.println("Employee Not added");


        } catch (ClassNotFoundException e) {
            //displaying the complete stack for exceptions
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
//				4.Close
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}