package com.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        int choice;


        ArrayList <Teacher> teacherList = new ArrayList<>();
        ArrayList <Student> studentList = new ArrayList<>();
        ArrayList <Course> courseList = new ArrayList<>();



        do {
            System.out.println (" Welcome to our School");
            System.out.println (" Please select an option from the Menu");
            System.out.println (" 1. Register Student");
            System.out.println (" 2. Register teacher");
            System.out.println (" 3. Assign a teacher to student");
            System.out.println (" 4. Assign a course to student");
            System.out.println (" 5. Show all students");
            System.out.println (" 6. Show all teachers");
            System.out.println (" 7. Show all courses");
            System.out.println (" 8. Exit");
            System.out.println (" Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println(" 1. Registering a new student");
                    System.out.println(" Enter student id: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(" Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.println(" Enter student age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine();

                    studentList.add(new Student (studentName, studentId, studentAge));
                    System.out.println("Student registered successfully");
                    break;
                case 2:
                    System.out.println(" 2. Registering a new teacher");
                    System.out.println(" Enter teacher id: ");
                    int teacherId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(" Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    System.out.println(" Enter subject: ");
                    String subject = scanner.nextLine();

                    teacherList.add(new Teacher (teacherId, teacherName, subject));
                    System.out.println("Teacher registered successfully");
                    break;
                case 3:
                    System.out.println(" 3. Assigning a teacher to student");
                    break;
                case 4:
                    System.out.println(" 4. Assigning a course to student");
                    break;
                case 5:
                    System.out.println(" 5. Showing all students");

                    if (studentList.isEmpty()){
                        System.out.println("No students are registered yet");
                    } else {
                        for (Student student : studentList){
                            System.out.println("ID: " + studentId + "Name: " + studentName + "Age: " + studentAge);
                        }
                    }
                case 6:
                    System.out.println(" 6. Showing all teachers");
                    break;
                case 7:
                    System.out.println(" 7. Showing all courses");
                    break;
                case 8:
                    System.out.println(" 8. Exiting");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        } while(choice != 8);

        System.out.println("GoodBye");




    }
}
