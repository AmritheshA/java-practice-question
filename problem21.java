//21. Write a program to multiply the adjacent values of an array and store it in an another array

import java.util.*;


class problem21 {
   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);


        int size = input.nextInt();
        int arr[] = new int[size];
        int arr1[] = new int[size-1];




        for(int i = 0;i<size;i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i = 0;i<size-1;i++)
        {
            arr1[i] = arr[i] * arr[i+1];
        }
        for(int i=0;i<size-1;i++)
        {
            System.out.print(" "+arr1[i]);
        }
    }
}
