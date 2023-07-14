  //17. Write a menu driven program to do the basic mathematical operations such as
//addition, subtraction, multiplication and division (hint: use if else ladder or switch)

import java.util.*;


class Calculator{
    public int add(int num1 ,int num2)
    {
        return num1 + num2;
    }


    public int sub(int num1 ,int num2)
    {
        return num1 - num2;
    }


    public int mul(int num1 ,int num2)
    {
        return num1 * num2;
    }


    public int div(int num1 ,int num2)
    {
        return num1 / num2;
    }
}


class problem17 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Calculator obj = new Calculator();


        System.out.println("1:- Addition \n2:- Subtraction\n3:- Multiplication\n4:- Division");
        int num = input.nextInt();


        System.out.println("Enter The Numbers To Do The Above Operation");
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        if(num == 1)
            System.out.println(obj.add(num1,num2));
        else if(num == 2)
            System.out.println(obj.sub(num1, num2));
        else if(num == 3)
            System.out.println(obj.mul(num1, num2));
        else if(num == 4)
            System.out.println(obj.div(num1, num2));
        else
            System.out.println("Sorry You Entered Wrong Number !!");


    }
}
