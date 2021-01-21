package com.test.concurrentpatterns.executor;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        try{
//            lock.lock();
            lock.lockInterruptibly();
            Thread.sleep(500);
        }finally {
            lock.unlock();
        }
    }
}
