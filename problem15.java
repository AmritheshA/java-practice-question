//   15. Write a program to accept an array and display it on the console using function

import java.util.*;

class problem15 {
    Scanner input = new Scanner(System.in);
    int array[] = new int[5];

    public int[] getArray() {
        int i = 0;

        System.out.println("Enter The Numbers:");
        while (i < 5) {
            array[i] = input.nextInt();
            i++;
        }
        return array;
    }

    public void display(int[] array) {
        int i = 0;

        while (i < 5) {
            System.out.print(" " + array[i]);
            i++;
        }
    }

    public static void main(String[] args) {

        // ArrayList<Integer> arr = new ArrayList<Integer>();

        problem15 obj = new problem15();

        obj.display(obj.getArray());

    }
}
