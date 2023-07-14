  //23. Write an object oriented program to store and display the values of a 2D array

import java.util.*;


class problem23 {
   
    public int[][] getArray(int size)
    {   Scanner input = new Scanner(System.in);
       
        int arr1[][] = new int[size][size];
        int arr2[][] = new int[size][size];
       
        System.out.println("Enter First Array :- ");
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


        problem23 obj = new problem23();


        obj.display(obj.getArray(size),size);
    }
}
