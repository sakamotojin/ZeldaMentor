package com.sumit.stiver.day4;
/*
* Two Sum : Check if a pair with given sum exists in Array
* Problem Statement: Given an array of integers nums[] and an
* integer target, return indices of the two numbers such that their sum is equal to the target.
* */
public class TwoSum {

    public static void bruteForceSol(){

        int A[] = {2,7,11,15, 19 , 18, 101, 101};
        int target = 9;
        int cnt = 0 ;
        for(int i = 0 ;i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                cnt = cnt + 1;
                if((A[i] + A[j])==target){
                    System.out.println(A[i]  + " , " +  A[j]);
                    System.out.println(i  + " , " +  j);
                }
            }
        }
        System.out.println(cnt);
    }

    public static void optimizedSol(){

        // Array Sorted
        int A[] = {2,7,11,15, 18 , 19, 101, 105};
        int target = 9;

        int l = 0 , r = A.length -1;

        while(l < r){
            int curSum = A[l] + A[r];
            if(curSum > target){
                r--;
            }
            else if(curSum < target){
                l++;
            }
            else{
                System.out.println(A[l] + " " + A[r]);
                System.out.println(l + " " + r);
                break;

            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Main Starting ");
        optimizedSol();
    }
}
