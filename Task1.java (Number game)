package com.mycompany.internshiptasks;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int max = 100;
        int round = 0;
        int maxAttempt = 3;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the number guessing game.");
        while (true) {
            round++;
            for (int i = 1; i <= maxAttempt; i++) {
                int ans = random.nextInt(max) + 1;
                System.out.println("Attemp " + i + " : Enter guess number upto 100: ");
                int guess = sc.nextInt();
                
                if(guess>=1 && guess<=100){
                if (guess == ans) {
                    System.out.println("The guess number is correct: " + ans);
                } else if (guess > ans) {
                    System.out.println("Sorry, guessed number is more than expected & random number is: " + ans);
                } else {
                    System.out.println("Sorry, guessed number is less than expected & random number is: " + ans);
                }

                if (i < maxAttempt) {
                    System.out.println("you have " + (maxAttempt - i) + " attempts left");
                }  
            }
                else{
                    System.out.println("Input invalid..");
                }
            }
            System.out.println("Thankyou, you have completed round: " + round);
            System.out.println("Do you want to play again (yes/no)");
            sc.nextLine();
            String playAgain = sc.nextLine();
            if (playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thankyou!");
                System.out.println("----------------------------***********----------------------------");
                System.out.println("Round: " + (round + 1));
            } else {
                System.out.println("Game over! you played " + round + " round");
                break;
            }
            
        }

    }
}
