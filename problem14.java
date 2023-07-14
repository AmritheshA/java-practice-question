//  14. Write a program to add to two dimensional arrays

import java.util.Scanner;

class problem14 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


        int row = input.nextInt();
        int column = input.nextInt();


        System.out.println("Enter The Values");
        int arr1[][] = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++){
                arr1[i][j] = input.nextInt();
            }
        }


        System.out.println("Enter The Values Of Second Array");
        int arr2[][] = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++){
                arr2[i][j] = input.nextInt();
                arr1[i][j] += arr2[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++){
               System.out.print("  " + arr1[i][j]);


            }
            System.out.println();
        }


    }
}
