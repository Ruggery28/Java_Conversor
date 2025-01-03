/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unitconverter;

import java.util.Scanner;

/**
 *
 * @author Ruggery
 */
public class UnitConverter {

    /* Now the main class will only ask the user to enter the options and the new class TemperatureConversor will have all the methods with the calculation,
    so it can be visual better to understand what is happening and I added more functionalities.*/
    public static void main(String[] args) {
        Scanner kBoard = new Scanner(System.in);
        int optionTemp = 0;
        System.out.println("Welcome to the Conversion Calculator! ");
        System.out.println("We are in progress, so, we only have two options, to convert temperaute and to calculate your BMI (Body Mass Index): ");

        do {
            System.out.println("What temperature do you want to convert? Enter [1] for Fahrenheit or [2] for Celsius:");
            if (kBoard.hasNextInt()) { //checks if temp is an integer, if the user enter a letter, it will go to ELSE.
                optionTemp = kBoard.nextInt();
                if (optionTemp != 1 && optionTemp != 2) { //checks if the value is 1 or 2, if not go to ELSE and comeback to the loop
                    System.out.println("This is not a valid option. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                kBoard.nextLine(); // Clear invalid input
            }
        } while (optionTemp != 1 && optionTemp != 2);

        TemperatureConversor tempValue = new TemperatureConversor(); //creating an object to go to the class TemperatureConversor
        tempValue.getTemperature(optionTemp); //sending what the user entered after the validation to the class getTemperature 

        int optionBMI = 0;
        System.out.println("Now, the program will calculate your BMI!");
        do {
            System.out.println("Enter: [1] - Centimeter and Kilogram  OR Enter: [2] - Inches and Pounds");
            if (kBoard.hasNextInt()) { //checks if temp is an integer, if the user enter a letter, it will go to ELSE.
                optionBMI = kBoard.nextInt();
                if (optionBMI != 1 && optionBMI != 2) { //checks if the value is 1 or 2, if not go to ELSE and comeback to the loop
                    System.out.println("You've entered a wrong option! Try it again. ");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                kBoard.next(); //clear invalid input
            }
        } while (optionBMI != 1 && optionBMI != 2);

        TemperatureConversor resultBMI = new TemperatureConversor(); //creating an object to go to the class TemperatureConversor
        double BMI = resultBMI.BMIValues(optionBMI); //creating a double variable BMI so I can send a double value to the method.
        resultBMI.ClassifyBMI(BMI); //sending the value as a double to validated it and return an answer
    }

}
