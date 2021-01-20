package com.test.concurrency;

//public class Singleton {
//    private static volatile Singleton instance;
//    private static Object lock = new Object();
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//
//        if(instance == null) {
//            return instance;
//        }
//
//        synchronized(lock) {
//            if(instance == null)
//                instance = new Singleton();
//            return instance;
//        }
//    }
//}

public enum Singleton {
    INSTANCE;
}
