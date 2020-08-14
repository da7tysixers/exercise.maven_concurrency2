package com.github.perschola;

import java.awt.geom.NoninvertibleTransformException;

public class AccountTest implements Runnable {
    private final Account account = new Account();
    @Override
    public void run() {

        while (account.getBalance() > 0){
            synchronized (Thread.currentThread()){
                try {
                    System.out.println(Thread.currentThread().getName() + " going to withdraw");
                    account.withdraw(10.0);
                    System.out.println(Thread.currentThread().getName() + " completed the withdrawal $" + account.getBalance());
                    if (account.getBalance() == 0){
                        System.out.println("Not enough in the account for " + Thread.currentThread().getName() + " to withdraw $" + account.getBalance());
                        break;
                    }
                    Thread.currentThread().wait(100);
                }catch (InterruptedException e){
                        e.printStackTrace();
                }
            }

        }// while

    }
}
