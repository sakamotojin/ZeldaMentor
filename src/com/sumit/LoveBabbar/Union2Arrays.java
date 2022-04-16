package com.sumit.LoveBabbar;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Union2Arrays {

    // Collection Of Unique Elements
    // duplicate elements

    public static int doUnion(int a[], int n, int b[], int m)
    {
        Set<Integer> s = new TreeSet<>();
        for(int i : a){
            s.add(i);
        }
        for(int i : b){
            s.add(i);
        }
        return s.size();
    }

    public static void testSet(){

        int a[] = { 10 , 1 , -3 , 2 , 2 , 3 , 4};
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        Set<Integer> s = new TreeSet<>();
        for(int i : a){
            s.add(i);
        }
        for(int i : s){
            System.out.print(i + " ");
        }
    }
}
