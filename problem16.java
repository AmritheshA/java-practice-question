// 6. Write a program to check whether a given number is prime or not

import java.util.*;


class problem16 {


    public static int prime(int num) {
        if (num <= 1) {
            return 0;
        }
   
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
   
        return 1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Number");


        int num = input.nextInt();


        if (problem16.prime(num) == 1)


            System.out.println("It Is Prime");
        else
            System.out.println("It Is Not Prime");


    }
}

