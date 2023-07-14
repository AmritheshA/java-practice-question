//  10. Write a program to interchange the values of two arrays.

import java.util.Scanner;

class problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Number");


        int num = input.nextInt();
        int arr1[] = new int[num];
        int arr2[] = new int[num];
        int i = 0;


        while(i<num)
        {   arr1[i] = input.nextInt();
            i++;
        }
        i = 0;
        System.out.println("Next Array");
        while(i<num)
        {
            arr2[i] = input.nextInt();
            i++;
        }
        i = 0;
        while(i<num)
        {   int temp;
            temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
            i++;
        }
     
        System.out.print("Array 1 :-  ");
        for(int k : arr1)
        {
            System.out.print(k);


        }
        System.out.println();
       
        System.out.print("Array 2 :- ");
        for(int k:arr2)
        {
            System.out.print(k);   }   }  }

