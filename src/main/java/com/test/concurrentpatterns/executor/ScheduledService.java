package com.test.concurrentpatterns.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledService {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task = () -> System.out.println("I am running!");
        service.scheduleAtFixedRate(task,10, 500, TimeUnit.MILLISECONDS);
        Thread.sleep(400);
        service.shutdown();
    }
}
