package com.kavish.tutorials.threads.ryanandmonicaproblem;

public class RyanAndMonicaJob implements Runnable {
    private BankAccount bankAccount = new BankAccount();

    @Override
    public void run() {

        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);
            if (bankAccount.getBalance() < 0) {
                System.out.println("Overdrawn");
            }
        }
    }

    private void makeWithdrawal(int amount) {
        if (bankAccount.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up.");
            bankAccount.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal.");
        } else {
            System.out.println("Sorry not enough for " + Thread.currentThread().getName());
        }
    }
}
