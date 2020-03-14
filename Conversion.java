/*
 * This program will give as options 5 different conversions. The user can choose 
one option and the program will run the selection. 
 */
package lab3;
/**
 *
 * @author Natalie Mulodjanov
 */
import java.util.Scanner;


public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double TO_FT = 3.28084;
        final double TO_USD = 0.72; //as of today
        final double TO_ML = 0.621371;
        final double TO_PD = 2.20462;
        double result; 
        System.out.println("+~~~~+~~~~~+~~~~~+~~~~~+~~~~~+"
                           +"\n|                            |"+
                            "\n|        CONVERSION          |"+
                            "\n|                            |"+
                            "\n+~~~~+~~~~~+~~~~~+~~~~~+~~~~~+");
        System.out.println("Please select the conversion you want to make"
                            + "\nSelect 1 for Meters to Feet Conversion"
                            + "\nSelect 2 for CAD to USD Conversion"
                            + "\nSelect 3 for Celsius to Fahrenheit Conversion"
                            + "\nSelect 4 for Kilometers to Miles Conversion"
                            + "\nSelect 5 for Kilograms to Pounds Conversion ");
        int selection = input.nextInt();
        
        switch (selection){
            case 1:
                System.out.println("***Meters To Feet Conversion***");
                System.out.println("Please enter the amount of meters you would like to convert");
                double meters = input.nextDouble();
                result = meters * TO_FT; 
                System.out.println(meters + " meters is equal to " + result + "feet");
                break;
                
            case 2:
                System.out.println("***CAD To USD Conversion***");
                System.out.println("Please enter the amount of CAD you would like to convert");
                double CAD = input.nextDouble();
                result = CAD * TO_USD;
                System.out.println("As of today," + CAD + " Canadian Dollars equal to " + result + " US Dollars");     
                break;
            
            case 3:
                System.out.println("***Celsius Degrees to Fahrenhite Degrees Conversion***");
                System.out.println("Please enter the amount of Celsius degrees you would like to convert ");
                double celsius = input.nextDouble();
                result = (celsius * 9/5) + 32;
                System.out.println(celsius + " Celsius degrees are equal to " + result + " Fahrenite degrees");
                break;
                
            case 4:
                System.out.println("***Kilometers to Miles Conversion***");
                System.out.println("Please enter the amount of Kilometers you would like to convert");
                double kilometers = input.nextDouble();
                result = kilometers * TO_ML;
                System.out.println(kilometers + " Kilometers are equal to " + result + " Miles");
                break;
            
            case 5: 
                System.out.println("***Kilograms to Pounds Conversion***");
                System.out.println("Please enter the amount of Kilograms you would like to convert ");
                double kilograms = input.nextDouble();
                result = kilograms * TO_PD;
                System.out.println(kilograms + " Kilograms are equal to " + result + " Pounds");            
        }
        System.out.println("Thank you for using the application" + 
                            "\nGoodBye");
        
        
    }
    
}
