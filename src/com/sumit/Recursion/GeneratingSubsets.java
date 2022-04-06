package com.sumit.Recursion;

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

    */
    private static int cnt = 0 ;

    public static void run(){
        int arr[] = {1 , 2 , 3 , 4, 5 , 6};
        int temp[] = new int[0];
        generateSubsets(0 , arr,temp);
        System.out.println(cnt);

    }

    static void generateSubsets(int idx , int inputArr[], int sub[]){

        int m = inputArr.length;
        if(idx == m) {
            cnt = cnt + 1;
            for(int i : sub){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }


        int n = sub.length;
        int temp[] = new int[n + 1];
        for(int i = 0 ; i < n; i++) temp[i] = sub[i];

        temp[n] = inputArr[idx];  // temp[0] = inp[0]
        generateSubsets(idx + 1 , inputArr ,sub);
        generateSubsets(idx + 1, inputArr , temp);

    }
}
