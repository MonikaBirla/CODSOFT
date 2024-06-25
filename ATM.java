package com.mycompany.internshiptasks;

public class ATM {

    private double balance;

    public ATM(double bankBalance) {
        this.balance = bankBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount is successfully deposited");
            System.out.println("Total amount is: "+ balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
        System.out.println("--------------------------**********--------------------------");
    }

    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance = balance - amount;
            System.out.println("Amount is successfully withdrew");    
            System.out.println("Total amount is: " + balance);
        } else {
            System.out.println("Amount is not available in account");
        }
        System.out.println("--------------------------**********--------------------------");
    }

    public double getCheckBankBalance() {
        return balance;
    }
}
