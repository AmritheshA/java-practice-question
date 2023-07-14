//  29.  Write a myFilter function that takes 2 parameters: myArray and callback.
// Here, myArray is an array of numbers and callback is a function that takes the elements of 
//myArray as its parameter and returns a boolean true if the sum of the number is even or   false if the sum of the number  is odd.

@FunctionalInterface
interface Function {
    boolean call();
}

public class problem29 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        Function sayHello = () -> {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            if (sum % 2 == 0) {
                return true;
            } else {

                return false;
            }
        };

        // Pass the function as a parameter to the runFunction() method
        myFilter(sayHello, arr);
    }

    public static void myFilter(Function func, int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (func.call()) {
            System.out.println(sum);
        } else {
            System.out.println(sum);
        }
    }
}
