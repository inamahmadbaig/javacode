package com.ashokit.inam.array;

public class ArraySum {
    public static void main(String[] args) {
//        int arr[]={1,3,5,7,9,8,10};
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of ->"+sum);
    }
}
