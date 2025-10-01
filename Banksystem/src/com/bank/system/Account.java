package com.bank.system;

public class Account extends Bank {

    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            recordTransaction("Deposited " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            recordTransaction("Withdrawn " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }

    @Override
    public double getBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }
}
