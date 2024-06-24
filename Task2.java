package com.mycompany.internshiptasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for marks in each subject
        System.out.println("enter the marks of maths out of 100: ");
        double mathsObtained = sc.nextDouble();
        System.out.println("enter the marks of physics out of 100: ");
        double phyObtained = sc.nextDouble();
        System.out.println("enter the marks of chemistry out of 100: ");
        double chemObtained = sc.nextDouble();
        
        // Define total number of subjects
        int totalNumberOfSubjects = 3;
        
        // Calculate total marks
        double totalMarks = mathsObtained + phyObtained + chemObtained;
        System.out.println("Total marks: "+totalMarks);
        
        // Calculate average percentage
        double averagePercentage = totalMarks/totalNumberOfSubjects;
        System.out.println("Average percentage: "+averagePercentage);
        
        // Determine and display the grade based on average percentage
        if(averagePercentage>=75 && averagePercentage<=100){
            System.out.println("Grade: A");
        }else if(averagePercentage>=65 && averagePercentage<75){
            System.out.println("Grade: B");
        }else if(averagePercentage>=45 && averagePercentage<65){
            System.out.println("Grade: C");
        }else if(averagePercentage>=33 && averagePercentage<45){
            System.out.println("Grade: D");
        }else{
            System.out.println("Fail");
        }
        
        
    }

}
