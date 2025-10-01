package com.bank.system;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Bank {
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Appending transaction to Bank.txt in project root
    protected void recordTransaction(String transaction) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Bank.txt", true))) {
            writer.write(transaction);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

