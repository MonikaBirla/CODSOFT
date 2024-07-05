package com.mycompany.internshiptasks;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("1. USD to Euro");
        System.out.println("2. Euro to USD");
        System.out.println("3. USD to Rupee");
        System.out.println("4. Rupee to USD");
        System.out.println("5. Euro to Rupee");
        System.out.println("6. Rupee to Euro");
        
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter the amount in USD");
            double usd = sc.nextDouble();
            usdToEuro(usd);
        } else if(choice == 2){
            System.out.println("Enter the amount in Euro");
            double euro = sc.nextDouble();
            euroToUsd(euro);
        }else if(choice == 3){
            System.out.println("Enter the amount in USD");
            double usd = sc.nextDouble();
            usdToRupee(usd);
        }else if(choice == 4){
            System.out.println("Enter the amount in Rupee");
            double rupee = sc.nextDouble();
            rupeeToUsd(rupee);
        }else if(choice == 5){
            System.out.println("Enter the amount in Euro");
            double euro = sc.nextDouble();
            euroToRupee(euro);
        }else if(choice == 6){
            System.out.println("Enter the amount in Rupee");
            double rupee = sc.nextDouble();
            rupeeToEruo(rupee);
        }
    }
    }
    public static void usdToEuro(double usd){
        double eur =  usd * 0.94;
        System.out.println("Converted amount in USD to Euro: "+eur);
        System.out.println("--------------------************--------------------");
    }
    
    public static void euroToUsd(double eur){
        double usd = eur * 1.07;
        System.out.println("Converted amount in Euro to USD: "+usd);
        System.out.println("--------------------************--------------------");
    }
    
    public static void usdToRupee(double usd){
        double rupee = usd * 83.58;
        System.out.println("Converted amount in USD to Rupee : "+rupee);
        System.out.println("--------------------************--------------------");
    }
    
    public static void rupeeToUsd(double rupee){
        double usd = rupee * 0.012;
        System.out.println("Converted amount in Euro to USD: "+usd);
        System.out.println("--------------------************--------------------");
    }
    
    public static void euroToRupee(double eur){
        double rupee = eur * 89.27;
        System.out.println("Converted amount in Euro to USD: "+rupee);
        System.out.println("--------------------************--------------------");
    }
    
    public static void rupeeToEruo(double rupee){
        double euro = rupee * 0.011;
        System.out.println("Converted amount in Euro to USD: "+euro);
        System.out.println("--------------------************--------------------");
    }
}
