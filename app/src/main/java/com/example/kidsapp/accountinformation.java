package com.example.kidsapp;

public class accountinformation {
    private double balance = 2600.00;
    private double savings = 17321.51;

    public void setBalance(double amount){
        balance = amount;
    }
    public double getBalance(){
        return balance;
    }
    public double getSavings(){
        return savings;
    }
    public void setSavings(double amount){
        savings = amount;
    }
}
