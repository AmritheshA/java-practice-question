//  19. Income tax is calculated as per the following table 

import java.util.*;


class problem19 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Your Amount");
        double limit = input.nextDouble();


       if(limit <= 2500_00)
            System.out.println("There Is No Taxation For You");
        else if (limit >= 25_00_00 && 50_00_00 >= limit)
            System.out.println("Income Tax Amount :- "+ 5 * limit/100);


        else if (limit >= 50_00_00 && 100_00_00 >= limit)
            System.out.println("Income Tax Amount :- "+ 20 * limit/100);


        else if (limit >= 100_00_00 && 500_00_00 >= limit)
            System.out.println("Income Tax Amount :- "+ 30 * limit/100);


        else    
            System.out.println("Sorry Something Is Wrong");  
    }
}
