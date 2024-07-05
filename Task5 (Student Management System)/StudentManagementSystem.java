package com.mycompany.internshiptasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

    private List<Student> student;

    public StudentManagementSystem() {
        this.student = new ArrayList<>();
    }

    public void addStudent(Student std) {
        student.add(std);
        System.out.println("Student added successfully");
    }

    public boolean removeStudent(int rollNumber) {
        for (Student std : student) {
            if (rollNumber == std.getRollNumber()) {
                student.remove(std);
                return true;

            }
        }
        return false;
    }

    public void searchStudent(int rollNumber) {
        for (Student std : student) {
            if (rollNumber == std.getRollNumber()) {
                System.out.println(std);
                System.out.println("Search completed successfully");
            }else{
                        System.out.println("Student not found");

            }
        }
    }

    public void displayAllStudent() {
        for (Student std : student) {
            System.out.println(std);
        }
    }
    
    public boolean editStudent(int rollNumber, String name, char grade){
        for(Student std: student){
            if(rollNumber == std.getRollNumber()){
                std.setName(name);
                std.setGrade(grade);
                return true;
            }
        }
        return false;
    }
    
    public void saveStudentsToFile(String fileName) throws IOException{
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
                for(Student std: student){
                    writer.write(std.getName()+ "," +std.getRollNumber()+ ","+ std.getGrade());
                    writer.newLine();
                }
                System.out.println("Student saved to file successfully");
            } catch(IOException e){
                System.out.println("Error saving students to file: "+e.getMessage());
            }
    }
    
    public void loadStudentsFromFile(String fileName) throws FileNotFoundException, IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            student.clear();
            
            while((line = reader.readLine()) != null){
                String parts[] = line.split(",");
                
                if(parts.length == 3){
                    String name = parts[0];
                    int rollNumber = Integer.parseInt(parts[1]);
                    char grade = parts[2].charAt(0);
                    
                    Student std = new Student(name, rollNumber, grade);
                    student.add(std);
                }
            }
            System.out.println("Student loaded from file successfully");
        } catch(IOException e){
            System.out.println("Error loading students from file: "+e.getMessage());
        }
    }
    

}
