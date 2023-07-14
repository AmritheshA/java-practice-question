// 27. Given a variable named my_height, you must throw errors under the following conditions:
// notANumberError- When my_heightis NaN
// HugeHeightError – When my_heightis greater than
// TinyHeight Error - When my_heightis less than


import java.util.*;


class tinyHeightError extends Exception {


    public tinyHeightError(String str) {
        super(str);
    }
}


class hugeHeightError extends Exception {


    public hugeHeightError(String str) {
        super(str);
    }
}


public class problem27 {
    public static void main(String args[]) {


        Scanner input = new Scanner(System.in);


        try {


            int height = input.nextInt();
            if (height < 25) {
                throw new tinyHeightError("Height Is Too Tiny");
            } else if (height > 200) {
                throw new hugeHeightError("Height Is Too HIgh");
            } else {
                System.out.println(height);
            }


        } catch (tinyHeightError msg) {
            System.out.println(msg.getMessage());
        } catch (hugeHeightError msg) {
            System.out.println(msg.getMessage());
        }


    }
}
