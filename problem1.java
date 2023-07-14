// 1. Accept a char input from the user and display it on the console.

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Char/String");
        
        String str = input.nextLine();

        System.out.println(str);
    }
}
