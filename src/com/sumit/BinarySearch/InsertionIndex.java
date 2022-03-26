package com.sumit.BinarySearch;
import java.util.*;



/*

Given a list of integers nums, sorted in ascending order, and a number target,
return the index where target should be inserted to keep nums sorted.
If target already exists in nums, return the largest index where target can be inserted.
[1, 3, 4, 6, 7, 7 , 7, 9]
 */


public class InsertionIndex {

    public static void solve(){
        System.out.println("test");
    }

    public static void bruteForce(){
        // O(n)
        // We are iterating the complete array
        int idx = 0 ;
        int num = 7;
        int arr[] = {1, 3, 4, 6, 7, 7 , 7, 9};

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > num) break;
            idx = i ;
        }
        System.out.println(idx);
    }


    public static void optimized(){
        // O(log(n))
        // We are using binary Search
        //Upper Bound / Lower Bound
        int num = 7;
        int arr[] = {1, 3, 4, 6, 7, 7 , 7, 9};
        int n = arr.length;
        int idx = n ;

        int l = 0 , r = n-1;

        while (l <= r){
            int mid = l + (r-l)/2 ;
            if(arr[mid] > num){
                r = mid -1;
                idx = r;
            }
            else {
                l = mid + 1;
            }
        }

        System.out.println(idx);

    }

}
