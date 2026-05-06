package com.ashokit.inam.array;

public class ArrayNonRepeatedElement {
    public static void main(String[] args) {
        int arr[]={2,3,2,1,3,4,5};
        for (int i=0;i< arr.length;i++){
            int count =0;
            for (int j =0;j< arr.length;j++ ){//for(j=i+1;j<arr.length;j++) //out put 231345
                if (arr[i]==arr[j]){
                    count++;
                }
            }
//            if(count==0)
            if (count==1){//out put 145
                System.out.println(arr[i]+" ");
            }

        }
    }
}
