package com.sumit.Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GeneratingPermutations {

    private static int cnt = 0 ;
    private static  int inputArr[] = {1 , 2 , 3 , 4};

    //Initially No Element Is Taken
    private static int arr[] = {-1,-1,-1,-1};

    public static void run(){
        generatePermutations(0);
        System.out.println(cnt);

    }

    static void  generatePermutations(int idx){
        if(idx == inputArr.length){
            cnt = cnt +1;
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == -1){
                arr[i] = inputArr[idx];
                generatePermutations(idx +1);
                arr[i] = -1;
            }
        }

    }
}
