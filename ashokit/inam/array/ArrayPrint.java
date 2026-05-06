package com.ashokit.inam.array;

import java.util.Arrays;

public class ArrayPrint {
    public static void main(String[] args) {
        int arr[] = {5,8,2,6,9,3,1};
        //first method to print array for loop

        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        //second method for each loop

        for (int x : arr){
            System.out.println(x+" ");
        }
        System.out.println();
        //third methods is

       System.out.println(Arrays.toString(arr));
    }
}
