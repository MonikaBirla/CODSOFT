package com.mycompany.internshiptasks;

import java.util.Scanner;

public class UserBankAcount {

    public static void main(String[] args) {

        double accountBalance = 0;
        Scanner sc = new Scanner(System.in);
        ATM user = new ATM(accountBalance);

        while (true) {
            System.out.println("Select option according to your need");
            System.out.println("Press 1 for deposit amount");
            System.out.println("Press 2 for withdraw amount");
            System.out.println("Press 3 for checking bank balance");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the amount to deposite: ");
                double deposit = sc.nextDouble();
                user.deposit(deposit);
            } else if (choice == 2) {
                System.out.println("Enter the amount for withdraw: ");
                double withdraw = sc.nextDouble();
                user.withdraw(withdraw);
            } else if (choice == 3) {
                System.out.println("Your current balance is: ");
                System.out.println(user.getCheckBankBalance());
                System.out.println("--------------------------**********--------------------------");
            } else {
                System.out.println("Invalid option, please try again");
                System.out.println("--------------------------**********--------------------------");
            }
        }
    }
}
