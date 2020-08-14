package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) {
        Thread myObject1 = new Thread(new MyObject());
        Thread myObject2 = new Thread(new MySecondThread());
        Thread myObject3 = new Thread(new MyThirdThread());
        myObject1.setName("My first Thread");
        myObject2.setName("My Second Thread");
        myObject3.setName("My Third Thread");

        try {

            System.out.println(myObject1.getName());
            myObject1.start();
            myObject1.join();
            System.out.println(myObject2.getName());
            System.out.println(myObject3.getName());
            myObject2.start();
            myObject3.start();
        }catch (InterruptedException e){

        }

    }
}
