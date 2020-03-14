
package lab3;

import java.util.Scanner;


public class Temperature {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius");
        double temp = input.nextDouble();
        System.out.println(temp > 0 ? "The temperature is above 0": "The temperature is below 0");  
    }
}
