package com.sumit.Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GeneratingSubsets {
    /*
    X = { 1, 2, 3} , 8 =  2*2*2
    Ans = {{} , {1} , {1 ,2} , {1, 2, 3} , {2} , {2,3} , {3} , {1,3}}

     f(x) = x^2 + 1

     f(x) = f(x-1) + f(x-2)           { x ==0 , 1 x > 0 , }

        AAAAA printASquare(sq) -> f(x)
        AAAAA
        AAAAA
        AAAAA

        1 = 0000001
        2 = 0000010
    */
    private static int cnt = 0 ;
    private static  int inputArr[] = {1 , 2 , 3 , 4, 5 , 6};

    //Initially No Element Is Taken
    private static boolean taken[] = {false,false,false,false,false,false};

    public static void run(){
        generateSubsets(0 ,new int[0]);

        //generateSubsets(0);
        System.out.println(cnt);

    }


    // Approach 1
    static void generateSubsets(int idx , int sub[]){

        int m = inputArr.length;
        if(idx == m) {
            cnt = cnt + 1;
            System.out.println(Arrays.toString(sub));
            return;
        }


        int n = sub.length;
        int temp[] = new int[n + 1];
        for(int i = 0 ; i < n; i++) temp[i] = sub[i];

        temp[n] = inputArr[idx];  // temp[0] = inp[0]
        generateSubsets(idx + 1 ,sub);
        generateSubsets(idx + 1, temp);
    }

    // Approach 2
    static void generateSubsets(int idx){
        if(idx == inputArr.length) {
            cnt = cnt +1;
            System.out.print(" [ ");
            for(int i = 0 ; i < idx; i++){
                if(taken[i]) System.out.print(inputArr[i] + " ,");
            }
            System.out.println(" ] ");
            return;
        }
        taken[idx] = true;
        generateSubsets(idx +1);
        taken[idx] = false;
        generateSubsets(idx + 1);
    }



}
