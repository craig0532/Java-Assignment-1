package com.bank.system;

public class AccountTest {
    public static void main(String[] args) {
        // create account with initial balance 500
        Account acc = new Account("Craig Huhuyana", 500);

        // sample transactions
        acc.deposit(200);    // valid deposit
        acc.withdraw(100);   // valid withdrawal
        acc.withdraw(700);   // should fail (exceeds balance)
        acc.deposit(-50);    // should fail (invalid deposit)
        acc.getBalance();    // prints current balance
    }
}
