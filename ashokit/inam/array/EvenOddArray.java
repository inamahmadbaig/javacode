package com.ashokit.inam.array;

import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value ");
        int n = Integer.parseInt(sc.nextLine());
        int arr[]= new int[n];
        if (n<0){
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.println("enter "+n+" ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("\n even number is ");
        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("\n odd number is ");
        for (int i=0;i<n;i++){
            if (arr[i]%2!=0){
                System.out.print(+arr[i]+" ");
            }
        }
    }
}
