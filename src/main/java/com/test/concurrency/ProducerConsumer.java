package com.test.concurrency;

public class ProducerConsumer {
    private static int[] buffer;
    private static int count;
    private static Object lock = new Object();

    static class Producer {
        void produce() {
            synchronized (lock) {
                if (isFull(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[count++] = 1;
                lock.notify();
            }
        }
    }

    static class Consumer {
        void consume() {
            synchronized (lock) {
                if (isEmpty(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[--count] = 0;
                lock.notify();
            }
        }
    }

    static boolean isEmpty(int[] buffer) {
        return count == 0;
    }

    static boolean isFull(int[] buffer) {
        return count == buffer.length;
    }

    public static void main(String[] args) throws InterruptedException {
        buffer = new int[10];
        count = 0;

        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Runnable producerTask = () -> {
            for (int i = 0; i < 50; i++) {
                producer.produce();
            }
        };

        Runnable consumerTask = () -> {
            for (int i = 0; i < 50; i++) {
                consumer.consume();
            }
        };

        Thread consumerThread = new Thread(consumerTask);
        Thread producerThread = new Thread(producerTask);

        consumerThread.start();
        producerThread.start();

        consumerThread.join();
        producerThread.join();

        System.out.println("Data in the buffer: " + count);
    }
}
