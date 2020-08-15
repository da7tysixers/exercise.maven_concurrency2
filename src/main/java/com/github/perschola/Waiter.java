package com.github.perschola;

public class Waiter implements Runnable {
    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            System.out.println(name + " waiting to get notified at time: " + System.currentTimeMillis());
            try {
                msg.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " waiter thread got notified at: " + System.currentTimeMillis() + ", " + name + " processed: " + msg);
        }
    }

}
