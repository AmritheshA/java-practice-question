// 3. Write a program to find the simple interest.

import java.util.Scanner;

public class problem3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Principle Intrest :- ");
        int P = input.nextInt();
        System.out.print("Enter Rate Of Intrest :- ");
        double R = input.nextDouble();
        System.out.println("Enter No. Years :- ");
        double n = input.nextDouble();


        System.out.println("Simple Interest For " + n + " Years With " + " Interest Of " + R + " :- " + (P * R * n) / 100);


    }
}
