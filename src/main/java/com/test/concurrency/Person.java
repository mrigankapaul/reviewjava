package com.test.concurrency;

public class Person {
    private final Object key = new Object();

    public String init() {
        synchronized (key) { //synchronized block
            // do some stuff
        }
        return "";
    }
}
