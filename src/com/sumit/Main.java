package com.sumit;


import com.sumit.BinarySearch.InsertionIndex;
import com.sumit.Collections.SetUsage;
import com.sumit.LoveBabbar.Union2Arrays;
import com.sumit.Recursion.GeneratingPermutations;
import com.sumit.Recursion.GeneratingSubsets;
import com.sumit.interfaces.AnalogWatch;
import com.sumit.interfaces.DigitalWatch;
import com.sumit.interfaces.User;
import com.sumit.interfaces.Watch;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main Starting ");

    }

    public static void testRecursion(){
        GeneratingSubsets.run();
        GeneratingPermutations.run();
    }

    public static void testInterface(){
        User userOne = new User(new DigitalWatch());
        User userTwo = new User(new AnalogWatch());
        userOne.run();
        userTwo.run();
    }

    public static void testSet(){
        SetUsage.solve();
        SetUsage.solve1();
    }

}
