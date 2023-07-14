// 9. Write a program to print the following pattern (hint: use nested loop)
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


import java.util.Scanner;

class problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Number");


        int row = input.nextInt();
        int i=1;
       


        while(i<=row)
        {   int j=1;
            while(j<=i)
            {
                System.out.print(" "+j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

