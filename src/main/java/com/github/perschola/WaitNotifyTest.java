package com.github.perschola;

public class WaitNotifyTest {
    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter1 = new Waiter(msg);
        Thread myThread = new Thread(waiter1);
        myThread.start();
        Waiter waiter2 = new Waiter(msg);
        Thread myThreadTwo = new Thread(waiter2);
        myThreadTwo.start();
        Thread notifier = new Thread(new Notifier(msg), "notifier");
        notifier.start();
        System.out.println("All the thread are started");

    }


//    Create a Message object and initialize it to "process it".
//    Create a Waiter object waiter1 and pass it the message object
//    Create a Thread that is initialize to waiter1 and is named waiter1 and start the thread
//    Create a second Waiter object waiter2 and pass it the same message object
//    Create a Thread that is initialize to waiter1 and is named waiter1 and start the thread
//    Create a Notifier object notifier and pass it the message object
//    Create a Thread that is initialize to notifier and is named notifier and start the thread
//    Print out "All the threads are started"
}
