//  24. Write a menu driven program to calculate the area of a given object.

import java.util.*;


class problem24 extends Area {
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in);
   
        Area obj = new Area();


        System.out.println("1:-Circle\n2:-Square\n3:-Rectangle\n4:-Triangle");
        int num = input.nextInt();


       
        if(num == 1)
           System.out.println(obj.circle());
        else if(num == 2)
            System.out.println(obj.square());
        else if(num == 3)
            System.out.println(obj.rectangle());
        else if(num == 4)
            System.out.println(obj.triangle());
        else
            System.out.println("Sorry Wrong Input");
       
    }
}
class Area {
   
    Scanner input = new Scanner(System.in);


    public double circle() {
        System.out.println("Enter The Radius :- ");
        double len = input.nextDouble();


        return (3.14 * (len*len));
    }


    public double square() {


        System.out.println("Enter The Length :- ");
        double len = input.nextDouble();


        return (len * len);
    }


    public double rectangle() {


        System.out.println("Enter The Length :- ");
        double len = input.nextDouble();
        System.out.println("Enter The Width :-");
        double wid = input.nextDouble();
       
        return (len * wid);
    }


    public double triangle() {


        System.out.println("Enter The Height :- ");
        double height = input.nextDouble();
        System.out.println("Enter The Width :-");
        double wid = input.nextDouble();


        return(height * wid)/2;
    }
}
