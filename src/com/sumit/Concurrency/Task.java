package com.sumit.Concurrency;

public class Task extends Thread{
    private Counter counter;
    private String name ;
    private long Id;
    public Task(Counter counter, long Id,  String name){
        super(name);
        this.counter = counter;
        this.Id = Id;
        this.name = name;

    }
    @Override
    public void run() {
        Thread.currentThread().setName(name);
        int cnt = 50000;
        while(cnt > 0){
            cnt--;
            counter.increment();
        }

    }
}
