// 5. Write a program to show the grade obtained by a student after he/she 
// enters their total mark percentage.

import java.util.Scanner;

class Sample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter You Mark");
        float mark = input.nextFloat();


        if(mark > 90)
        System.out.println("You Got A Grade");
        else if(mark <90 && mark >=80)
        System.out.println("You Got B Grade");
        else if(mark < 80 && mark >= 70)
        System.out.println("You Got C Grade");
         else if(mark < 70 && mark >= 60)
        System.out.println("You Got D Grade");
         else if(mark < 60 && mark >= 50)
        System.out.println("You Got E Grade");
        else
        System.out.println("Sorry You are failed");
   
    }
}
