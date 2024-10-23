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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Welcome to the Conversion Calculator: ");
        System.out.println("We are in progress, so we only have two options, to convert temperaute and to calculate your BMI (Body Mass Index)");
        
        System.out.println("Choose 1 for Temperature conversion or 2 to Calculate your BMI");
        int option = kBoard.nextInt();
        //EVERYTHING INSIDE THIS 'IFS' SHOULD CALCULATE THE TEMPERATURE CONVERSION!
        if (option == 1) {
            //USING DO-WHILE CAUSE I NEED TO ASK AT LEAST ONE TIME IF THE USER NEEDS ONE OF THE OPTION
            //I WANT TO KEEP ASKING HIM UNTIL HE CHOOSE THE RIGHT ONE.
            int type = -1;
            do {
                System.out.println("What temperature do you have: Type 1-Celscius or 2-Fahrenheit");
                type = kBoard.nextInt();
                switch (type) {
                    case 1 :
                        float celcius;
                        System.out.println("Enter the temperature in Celcius and I will give you in Fahrenheit: ");
                        celcius = kBoard.nextFloat();
                        System.out.println("The temperature " + celcius + " celcius in Fahrenheit is: " + (((celcius * 9) / 5) + 32));
                        return; // RETURN IS USED TO STOP AND CLOSE THE VALID OPTION
                    case 2:
                        float fahreinheit;
                        System.out.println("Enter the temperature in Fahreinheit and I will give you in Celcius: ");
                        fahreinheit = kBoard.nextFloat();
                        System.out.println("The temperature " + fahreinheit + " fahreinheit in Celcius is: " + (((fahreinheit - 32) * 5) / 9));
                        return; // RETURN IS USED TO STOP AND CLOSE THE VALID OPTION
                    default:
                        System.out.println("Error: Invalid option, try it again!");
                }
                    //(I NEED TO FIX IT LATER, ADD A CONDITION TO CHECK IF THE USER ENTER A LETTER!!!!!!)
            } while (type != 1 && type != 2);
        } else if (option == 2) {
            //EVERYTHING INSIDE THIS ELSE IF SHOULD CALCULATE THE BMI!
            kBoard.nextLine();
            System.out.println("To calculate your body mass I need only two things, your weight(kilograms) and height(centimiters): ");
            String convert;
            float weight, height;
            do{
                System.out.println("The system accept only kilograms and centimeter. Do you need to convert your values? Y or N");
                convert = kBoard.nextLine();
                System.out.println(convert);
                if (convert.equalsIgnoreCase("Y")) {
                    System.out.println("Enter your weight in pounds: ");
                    float pounds = kBoard.nextFloat();
                    System.out.println("Enter your height in inches");
                    float inches = kBoard.nextFloat();
                    System.out.printf("Your weight in Kilograms is: %.2f And your height in centimeters is: %.2f%n ", (pounds / 2.205), (inches * 2.54));
                    return;
                } else if (convert.equalsIgnoreCase("N")) {
                    System.out.println("Ok, you must know it already! ");
                    System.out.println("What is your weight in Kilograms:  ");
                    weight = kBoard.nextFloat();
                    System.out.println("What is your height in centimeter: ");
                    height = kBoard.nextFloat();
                    float meter = height / 100;
                    float formula = weight / (meter * meter);
                    System.out.printf("Your BMI is %.2f%n ", formula);
                    if (formula < 18.5) {
                        System.out.println("Your BMI is classified as Underweight and level 0 obesity, you need some kilos!");
                    } else if (formula > 18.5 && formula < 24.9) {
                        System.out.println("Your BMI is classified as Normal and level 0 obesity, keep the shape!");
                    } else if (formula > 24.9 && formula < 29.9) {
                        System.out.println("Your BMI is classified as Overweight and level I obesity, calm down and loose a few kilos!");
                    } else if (formula > 29.9 && formula < 39.9) {
                        System.out.println("Your BMI is classified as Obesity and level II obesity, You need a diet, the pants is not fitting!");
                    } else {
                        System.out.println("Your BMI is classified as Extreme Obesity and level III obesity, Of course, you need to shut your mouth and start exercising!");
                    }
                    return;
                } else {
                    System.out.println("Error: Invalid option, try it again!");
                }
            }while(convert.toUpperCase() != "y" && convert.toUpperCase() != "n");

        }
    }

}


/*
First - Temperature ( celcius to fahrenheit) = ('0 °C' × 9/5) + 32 = '32 °F' // °C = (°F - 32) × 5/9
length or height (centimeter to inches) = (centimeter / 2.54) = iches
weight (kilograms to pounds) =  (kilograms * 2.205) = pounds
BMI ( body mass index) indice de massa corporal = (kilograms / height^2)
IMC                     Classificação           Obesidade(grau)
Menor que 18,5          Magreza                 0
Entre 18,5 e 24,9	Normal                  0
Entre 25,0 e 29,9	Sobrepeso               I
Entre 30,0 e 39,9	Obesidade               II
Maior que 40,0          Obesidade Grave         III
 */
