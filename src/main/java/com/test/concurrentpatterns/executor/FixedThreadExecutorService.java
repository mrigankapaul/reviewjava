package com.test.concurrentpatterns.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadExecutorService {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("I am in thread" + Thread.currentThread().getName());
        ExecutorService service = Executors.newFixedThreadPool(4);
        for(int i=0; i < 5; i++) {
            service.execute(task);
        }

        service.shutdown();
    }
}
