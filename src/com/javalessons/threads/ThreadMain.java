package com.javalessons.threads;

public class ThreadMain {

    public static void main(String[] args) {

        Thread tt = Thread.currentThread();
        System.out.println(tt);
        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");
    }
}

class JThread extends Thread {

    JThread(String name){
        super(name);
    }

    @Override
    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}