/*
 * This program will verify if the password entered is the same as the password 
confirmation.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Natalie Mulodjanov
 */
public class Question47 {
    public static void main(String[] args) {
        System.out.println("\n\n\n****PASSWORD****\n\n\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password ");
        String password = input.nextLine();
        System.out.println("Please confirm your password");
        String password1 = input.nextLine();
        
        String passwordTrim = password.trim();
        String password1Trim= password1.trim();
        
        if (password1Trim.equals(passwordTrim)){
            System.out.println("You are now registered as a new user ");
        }else {
            System.out.println("Sorry, there is a typo in your password confirmation ");
        }
    }
}
