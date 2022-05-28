package com.sumit.sorting;

/*
A1 = [1, 2, 0, 7]
  i = 2
A2 = [4 , 5, 9, 10]
   j = 0
res = [1, 2, 4, 5, 6, 7, 9 , 10]
 k = 2

l = 0 r = 1
 */
public class MergeSort {

    /*

        [1, 3, 4, 2, 5, 10 , 5, 6, 11]
        tem[] = {1 , 2, 3, 4, 5, 10}
        l = 0 , mid = 2
        mid = 3 , r = 5
     */
    public static void  merge(int a[] ,int l , int mid , int r){

        int total = r - l + 1;
        int temp[] = new int[total];
        int i = l , j = mid + 1 , k = 0;

        while (k < total){

            // base case handle
            if(i > mid){
                temp[k] = a[j];
                j++;
                k++;
                continue;
            }

            if(j > r){
                temp[k] = a[i];
                i++;
                k++;
                continue;
            }


            if( a[i] > a[j]){
                temp[k] = a[j];
                j++;
                k++;
            }
            else{
                temp[k] = a[i];
                i++;
                k++;
            }
        }
        i = 0 ;
        for(int idx = l; idx <= r; idx++){
            a[idx] = temp[i];
            i++;
        }
    }
    /*
      [1 , 2, 3]
       l =0 r =2
       [0 , 1][2 , 2]
       []
     */
    public static void  mergeSort(int a[], int l , int r){

        if(l >= r) return;
        int mid = (l + r)/2 ;
        mergeSort(a , l , mid);
        mergeSort(a , mid + 1 , r);
        merge(a , l , mid , r);
    }

    public static void main(String args[]){

        int a[] = {1 , 0, 2, 6, 3, 4, 9, 0 ,3};
        int l = 0 , r= a.length -1;
        mergeSort(a , 0 , r);

        for(int i : a){
            System.out.print(i + " ");
        }


    }

}
