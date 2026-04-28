package nareshit.array;

import java.util.Scanner;

public class ArrayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = Integer.parseInt(sc.nextLine());
        if (n<1){
            System.out.println("Invalid Array size.");
        }
        int arr[] = new int[n];
        int prime=0;
        System.out.println("enter number of element "+n + " \n");
        for (int i=0;i<n;i++){
            arr[i]= Integer.parseInt(sc.nextLine());
        }

        for (int i=0;i<n;i++){
            int count=0;
            for (int j=1;j<=arr[i];j++){
                if (arr[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                prime++;
                System.out.println(arr[i]);
            }
        }
        if (prime==0){
            System.out.println("no prime number found. ");
        }
        sc.close();
    }
}
