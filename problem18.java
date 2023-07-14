//   18. Grades are computed using a weighted average. Suppose that the written test counts 70%,  
// lab exams 20% and assignments 10%.

import java.util.*;


class problem18 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Written Text Mark");
        double wMark = input.nextDouble();


        System.out.println("Enter Lab Exams Mark");
        double eMark = input.nextDouble();


        System.out.println("Enter Assignment Marks");
        double aMark = input.nextDouble();


        System.out.println("Your Grade In This Accadamic Year :- "+((wMark * 70) + (eMark * 20) + (aMark * 10))/100);


    }
}

