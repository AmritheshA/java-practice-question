//4. Write a program to check whether a student has passed or failed in a subject after he or she 
// enters their mark (pass mark for a subject is 50 out of 100).

import java.util.Scanner;

class problem4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter You Mark");
        float mark = input.nextFloat();


        if(mark >=50)
        System.out.println("congrats you are passed");
        else
        System.out.println("Sorry You are failed");
   
    }
}
