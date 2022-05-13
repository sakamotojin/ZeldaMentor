package com.sumit.Collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class Pair<T , V>{
    T first ;
    V second;
    public Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }
    Queue<Pair<Integer,Integer>> queue = new PriorityQueue<>();


};


public class Test {

    public static void run(){
        Pair<Integer, Integer> pair;


    }

}
