// 12. Write a program to sort an array in descending order

import java.util.Scanner;


class problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Number");


        int num = input.nextInt();
        int arr[] = new int[num];
        int i = 0;
        while(i<num)
        {
            arr[i] = input.nextInt();
            i++;
        }
        for(i = 0;i<num;i++)
        {
            for(int j= 0;j<num;j++)
            {
                if(arr[i] >= arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for(int k : arr)
        {
            System.out.print(k);
        }
    }


}
