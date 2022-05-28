package com.sumit.Concurrency;

public class Counter {
    private int value = 0;
    public synchronized void increment(){
        value = value + 1;
        System.out.println("counter value : " + value);
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("thread id : " + id);
        System.out.println("thread name : " + name);
    }

}
