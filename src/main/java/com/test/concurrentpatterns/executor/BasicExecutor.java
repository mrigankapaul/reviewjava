package com.test.concurrentpatterns.executor;

import java.util.concurrent.*;

public class BasicExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        Runnable task = () -> System.out.println("I am running!");
        singleThreadExecutor.execute(task);
        singleThreadExecutor.shutdown();

        // second example
        Callable<String> callable = () -> {
            Thread.sleep(500);
            return "Task Completed";
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callable);
        System.out.println(future.get());
        executorService.shutdown();
    }
}
