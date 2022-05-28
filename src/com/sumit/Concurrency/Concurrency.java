package com.sumit.Concurrency;

public class Concurrency {

    public static void main(String args[]){
        Counter counter = new Counter();
        for(int i = 0;i < 5; i++){
            new Task(counter,i,Integer.toString(i)).start();
        }
    }

}
