/*
 * This program will calculate the area of a circle only if the radius is 
not negative or a zero 
 */
package lab3;
import java.util.*;
/**
 *
 * @author Natalie Mulodjanov
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        System.out.println("+~~~~+~~~~~+~~~~~+~~~~~+~~~~~+"
                           +"\n|                            |"+
                            "\n|    Area Of A Circle        |"+
                            "\n|                            |"+
                            "\n+~~~~+~~~~~+~~~~~+~~~~~+~~~~~+");
        System.out.println("Please enter the radius of the circle");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        
        if (radius <=0 ){
            System.out.println("The Program cannot calculate the ares because the number entered is either negative or 0");   
        }
        else {
            System.out.printf("the area of the circle is: %.2f units\n", area );
        }
        System.out.println("\n\nThank you for using the application "+
                            "\nGoodBye");
    }   
}
    
      