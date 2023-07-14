//  8. Write a program to find the sum of all the odd numbers for a given limit

import java.util.Scanner;

class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Number");


        int num = input.nextInt();
       
        int sum = 0;
        for(int i=1;i<=num;i++){
        if(i % 2 != 0)
        {
            sum += i;
        }
    }
        System.out.println("Sum :- "+sum);
       
    }
}
