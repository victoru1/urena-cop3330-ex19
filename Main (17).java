/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) throws Exception {
    calculateBMI();
  }
 
  private static void calculateBMI() throws Exception {
    System.out.print("Please enter your weight in pounds: ");
    Scanner s = new Scanner(System.in);
    float weight = s.nextFloat();
    System.out.print("Please enter your height in inches: ");
    float height = s.nextFloat();

    float bmi = (703*weight)/(height*height);
         
    System.out.printf("Your BMI is: %.1f", bmi);
    printBMICategory(bmi); 
  }
     
  private static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("\nYou are underweight. You should see your doctor.");
        }else if (bmi < 25) {
            System.out.println("\nYou are within the ideal weight range.");
        }else if (bmi < 30) {
            System.out.println("\nYou are overweight. You should see your doctor.");
        }else {
            System.out.println("\nYou are obese. You should see your doctor.");
        }
    }
}