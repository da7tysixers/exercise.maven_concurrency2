package com.github.perschola;

public class MyObject implements Runnable {
    public void run() {
        try {


            for (int i = 1; i <= 5; i++) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
