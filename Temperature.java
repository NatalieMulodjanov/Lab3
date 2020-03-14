/*
 * This program will get as input the current temperature and will output 
different messages depending on if the temperature is below or above 0.
 */
package lab3;

import java.util.Scanner;
/**
 *
 * @author Natalie Mulodjanov
 */
public class Temperature {
    public static void main(String[] args) {
        System.out.println("+~~~~+~~~~~+~~~~~+~~~~~+~~~~~+"
                           +"\n|                            |"+
                            "\n|        Temperature         |"+
                            "\n|                            |"+
                            "\n+~~~~+~~~~~+~~~~~+~~~~~+~~~~~+");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius");
        double temp = input.nextDouble();
        System.out.println(temp > 0 ? "The temperature is above 0": "The temperature is below 0");  
        System.out.println("\n\nThank you for using the application "+
                            "\nGoodBye");
    }
}
