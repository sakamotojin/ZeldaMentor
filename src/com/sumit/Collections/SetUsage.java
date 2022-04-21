package com.sumit.Collections;

/*
  [1 , 2, 3 , 2 , 4 , 5 , 7, 7]
  [1, 2 , 3, 4 , 5 , 7]
*/

import java.util.*;

public class SetUsage {

    public static void solve(){

        Set<Integer> set = new HashSet<>();

        int arr[] = {2 , 2, 3 , 2 , -4 , 5 , 7, 7};

        for(int i = 0 ; i < arr.length; i++){
            set.add(arr[i]);
        }
        for(int i : set){
            System.out.print(i + " ");
        }
    }

    public static void solve1(){
        /*
          A = [1 , 2 , 3 , 5 , 6 , 7]
          B = [2 , 3, 4 , 10 , 12]

          ANS = [2 , 3]

          A ^ B = [2 , 3]
          A U B = [1 , 2 , 3, 4, 5 , 6, 7, 10 , 12]

         */
        int A[] = {1 , 2 , 3 , 5 , 6 , 7};
        int B[] = {2 , 3, 4 , 10 , 12};

        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();
        Set<Integer> unionAB  = new TreeSet<>();
        Set<Integer> InterAB  = new TreeSet<>();


        for(int i = 0 ; i < A.length; i++){
            setA.add(A[i]);
        }

        for(int i = 0 ; i < B.length; i++){
            setB.add(B[i]);
        }

//        for(int i : setA){
//            if(setB.contains(i)) InterAB.add(i);
//        }

        unionAB.addAll(setA);
        unionAB.addAll(setB);

        InterAB.addAll(setA);
        InterAB.retainAll(setB);

        System.out.println("A : " + setA);
        System.out.println("B : " + setB);
        System.out.println("Union " + unionAB);
        System.out.println("Inter " + InterAB);



    }
}
