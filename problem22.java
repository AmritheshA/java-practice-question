//22. Write a program to add the values of two 2D arrays

import java.util.*;


class problem22 {
   
    public int[][] getArray(int size)
    {   Scanner input = new Scanner(System.in);
       
        int arr1[][] = new int[size][size];
        int arr2[][] = new int[size][size];
       
        System.out.println("Enter Frist Array :- ");
        for(int i = 0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter Second Array :- ");

        for(int i = 0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr2[i][j] = input.nextInt();
            }
        }

        for(int i = 0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr2[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return arr2;
    }

    public void display(int[][] arr,int size)
    {
        for(int i = 0;i<size;i++)
        {
            for(int j = 0;j<size;j++)
            {
            System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
         int size = input.nextInt();


        problem22 obj = new problem22();


        obj.display(obj.getArray(size),size);
    }
}
