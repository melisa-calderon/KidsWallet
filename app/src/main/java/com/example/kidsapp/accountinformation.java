package com.example.kidsapp;

public class accountinformation {
    private static double balance = 602.45;
    private static double savings = 1732.51;

    public static void setBalance(double amount){
        balance = amount;
    }
    public static double getBalance(){
        return balance;
    }
    public static double getSavings(){
        return savings;
    }
    public static void setSavings(double amount){
        savings = amount;
    }
}
