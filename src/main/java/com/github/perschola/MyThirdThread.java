package com.github.perschola;

public class MyThirdThread implements Runnable {

    @Override
    public void run() {
        try {

            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

