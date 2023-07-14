//  7.Write a program to print the multiplication table of given numbers.

import java.util.Scanner;

class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Number");


        int num = input.nextInt();
        int i = 1;
        while(i<=10)
        {
            System.out.println(" "+ i+" * " +" "+num+" = "+(num*i));
            i++;
        }


       
    }
}
