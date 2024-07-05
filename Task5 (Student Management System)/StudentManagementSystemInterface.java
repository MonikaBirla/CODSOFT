package com.mycompany.internshiptasks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StudentManagementSystemInterface {

    private static StudentManagementSystem msg = new StudentManagementSystem();
    private static final String fileName = "student.file";

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. add");
            System.out.println("2. remove");
            System.out.println("3. serch");
            System.out.println("4. display");
            System.out.println("5. Edit");
            System.out.println("6. save");
            System.out.println("7. load");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter name");
                String name = sc.nextLine();
                System.out.println("Enter roll number");
                int rollNumber = sc.nextInt();
                System.out.println("Enter grade");
                char grade = sc.next().charAt(0);

                Student std = new Student(name, rollNumber, grade);
                msg.addStudent(std);
            } else if (choice == 2) {
                System.out.println("Enter roll number for remove");
                int rollNumber = sc.nextInt();
                boolean removed = msg.removeStudent(rollNumber);
                if (removed) {
                    System.out.println("Student removed");
                } else {
                    System.out.println("Student not found");
                }
            } else if (choice == 3) {
                System.out.println("Enter roll number for search");
                int rollNumber = sc.nextInt();
                msg.searchStudent(rollNumber);
            } else if (choice == 4) {
                msg.displayAllStudent();
            } else if (choice == 5) {
                System.out.println("Enter roll number to edit");
                int rollNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter new name");
                String name = sc.nextLine();
                System.out.println("Enter new grade");
                char grade = sc.next().charAt(0);

                boolean edited = msg.editStudent(rollNumber, name, grade);
                if (edited) {
                    System.out.println("Student updated successfully");
                } else {
                    System.out.println("Student not found");
                }
            } else if (choice == 6) {
                msg.saveStudentsToFile(fileName);
            } else if (choice == 7) {
                msg.loadStudentsFromFile(fileName);
                System.out.println("Exiting..");
            } else {
                System.out.println("choose correct option");
            }
        }
    }

    public static boolean validateInput(String name, int rollNumber, char grade) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        if (rollNumber <= 0) {
            return false;
        }
        if (grade < 'A' || grade > 'F') {
            return false;
        } else {
            return true;
        }
    }
}
