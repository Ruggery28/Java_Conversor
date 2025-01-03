/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitconverter;

import java.util.Scanner;

/**
 *
 * @author Ruggery
 */
public class TemperatureConversor {

    Scanner kBoard = new Scanner(System.in);

    public static double getValidDouble(Scanner kBoard) { //important method that will check if the user entered a number
        while (!kBoard.hasNextDouble()) { //while there is a number will return the kBoard, if it's a word will print the error and ask to enter again.
            System.out.println("Invalid input! Enter a valid number: ");
            kBoard.nextLine();
        }
        return kBoard.nextDouble();
    }

    public void getTemperature(int optionTemp) {

        double value = 0;
        //option will come from the main and switch will analize if it's 1 or 2
        switch (optionTemp) {
            case 1:
                System.out.println("Enter the temperature in Celcius and I will give you in Fahrenheit: ");
                double celcius = getValidDouble(kBoard); //using another method to validated if the user will enter a number
                value = ((celcius * 9) / 5) + 32;
                System.out.printf("The temperature " + celcius + " celcius in Fahrenheit is: %.2f%n", value);
                break;
            case 2:
                System.out.println("Enter the temperature in Fahreinheit and I will give you in Celcius: ");
                double fahreinheit = getValidDouble(kBoard); //using another method to validated if the user will enter a number
                value = ((fahreinheit - 32) * 5) / 9;
                System.out.printf("The temperature " + fahreinheit + " fahreinheit in Celcius is: %.2f%n", value);
                break;
            default:
                System.out.println("Error: Invalid option, try it again!");
        }

    }

    public double BMIValues(int BMIoption) { // method that will calculate the BMI from the user

        double result = 0;
        //option will come from the main and switch will analize if it's 1 or 2
        switch (BMIoption) {
            case 1:
                System.out.println("Enter your weight in kilograms: ");
                double kilo = getValidDouble(kBoard); //using another method to validated if the user will enter a number

                System.out.println("Enter your height in centimeters: ");
                double cent = getValidDouble(kBoard);

                result = kilo / ((cent / 100) * (cent / 100));
                System.out.printf("Your BMI is: %.2f%n", result);
                break;

            case 2:
                System.out.println("Enter your weight in pounds: ");
                double pounds = getValidDouble(kBoard); //using another method to validated if the user will enter a number

                System.out.println("Enter your height in inches: ");
                double inches = getValidDouble(kBoard);

                pounds = pounds / 2.205;
                inches = inches * 2.54;
                result = pounds / ((inches / 100) * (inches / 100));
                System.out.printf("Your BMI is: %.2f%n", result);
                break;
        }

        return result;
    }

    public void ClassifyBMI(double result) { //simple method to classify the result of the BMI
        if (result < 18.5) {
            System.out.println("Your BMI is classified as Underweight and level 0 obesity, you need some kilos!");
        } else if (result >= 18.5 && result < 24.9) {
            System.out.println("Your BMI is classified as Normal and level 0 obesity, keep the shape!");
        } else if (result >= 24.9 && result < 29.9) {
            System.out.println("Your BMI is classified as Overweight and level I obesity, calm down and loose a few kilos!");
        } else if (result >= 29.9 && result < 39.9) {
            System.out.println("Your BMI is classified as Obesity and level II obesity, You need a diet, the pants is not fitting!");
        } else {
            System.out.println("Your BMI is classified as Extreme Obesity and level III obesity, Of course, you need to shut your mouth and start exercising!");
        }
    }

}
