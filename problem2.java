//  2. Accept two inputs from the user and output their sum.

import java.util.Scanner;

public class problem2
{


    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);


       System.out.println("Enter Two Numbers :");


        int num1 = input.nextInt();
        int num2 = input.nextInt();


        System.out.println("Sum Of " + num1 + " and " +num2 +" : " +(num1+num2));
       
    }
}
