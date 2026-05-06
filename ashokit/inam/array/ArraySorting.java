package com.ashokit.inam.array;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int arr[] = {5,8,2,6,9,3,1};
        int temp=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
//                int x=arr[i];
//                int y=arr[j];
                //if (arr[i] < arr[j]) // this print like [5 4 3 2 1]
                if (arr[i]>arr[j]){ // this print like [1 2 3 4 5 6]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            //System.out.println(Arrays.toString(arr)); // pr is me multiple line me hoga print
        }
        System.out.println(Arrays.toString(arr));//ek hi line me hoga print
    }
}
