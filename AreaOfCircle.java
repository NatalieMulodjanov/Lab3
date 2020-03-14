
package lab3;
import java.util.*;

public class AreaOfCircle {

    public static void main(String[] args) {
        
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
    } 
}
    
      