// 11. Write a program to find the number of even numbers in an array

import java.util.Scanner;


class problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Number");


        int num = input.nextInt();
        int arr[] = new int[num];
        int i = 0;
        int count = 0;
        while(i<num)
        {
            arr[i] = input.nextInt();
            i++;
        }


        for(int k : arr)
        {
            if(k % 2 == 0)
            count++;
        }


        System.out.println("Number Of Even Numbers "+count);
       
    }
}
