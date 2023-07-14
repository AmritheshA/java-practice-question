// 6. Using the ‘switch case’ write a program to accept an input number from the
//    user and output the day as follows. 

import java.util.Scanner;

class problem6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Number");
        int day = input.nextInt();


        switch(day)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
           
        }


   
    }
}
