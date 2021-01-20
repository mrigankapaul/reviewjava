package com.test.concurrency;

public class FirstRunnable {
    public static void main(String[] args){
        Runnable runnable = () -> {
            System.out.println("I am running in thread ->" + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("mythread");
        t.start();
    }
}
