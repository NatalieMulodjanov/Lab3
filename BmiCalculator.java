package lab3;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        
        double weight, height, weightKG, heightM, BMI;
        final double TO_KG = 0.453592;
        final double TO_M = 0.3048;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in feet and weight in pounds");
        height = input.nextDouble();
       weight = input.nextDouble();
       
        weightKG = weight * TO_KG;
        heightM = height * TO_M;
        
        BMI = weightKG / Math.pow(heightM, 2);
        
        System.out.println("Your height in meters is: " + heightM);
        System.out.println("Your Weight in K is: "+ weightKG);
        System.out.println("Your BMI is: " + BMI);
        
        
        if (BMI<18.5){
            System.out.println("Your BMI is classified as 'underweight'");
        } else if (BMI < 24.9){
            System.out.println("Your BMI is classified as 'normal weight'");
        } else if (BMI < 29.9){
            System.out.println("Your BMI is classified as 'overweight'");
        } else if (BMI <34.9){
            System.out.println("Your BMI is classified as 'obese");
        }
         
            
    }
}
