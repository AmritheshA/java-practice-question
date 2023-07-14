// 13. Write a program to identify whether a string is a palindrome or not

import java.util.Scanner;


class problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Word");
        String word = input.nextLine();


        int i = 0;
        int j = word.length();
        int count = 0;


        while (i < word.length() && j > 0) {
            if (word.charAt(i) == word.charAt(j - 1)) {
                count++;
            }
            j--;
            i++;
        }
        if (count == word.length())
            System.out.println("It Is Palindrome");
        else
            System.out.println("It Is Not Palindrome");


    }


}

