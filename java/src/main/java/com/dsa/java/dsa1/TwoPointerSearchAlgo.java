package com.dsa.java.dsa1;

import java.util.Arrays;

public class TwoPointerSearchAlgo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] reversedArr = twoPointerSearch(arr);
        System.out.println(Arrays.toString(reversedArr));
    }

    public static int[] twoPointerSearch(int [] arr){
        for (int i=0; i<arr.length/2; i++){
            int x = arr[i];
            int y = arr[arr.length-1-i];
            //swap
            arr[i]= y;
            arr[arr.length-1-i] = x;
            
        }
        return arr;
    }
}
