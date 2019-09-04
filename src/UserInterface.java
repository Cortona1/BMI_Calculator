import java.util.Scanner;
import java.lang.Math;

public class UserInterface {

    private Scanner reader;

    public UserInterface(Scanner reader) {
        this.reader = reader;

    }

    public void start() {
        introductions();
        userDecision();
        conclusion();
    }

    public void introductions() {
        System.out.println("\n*************************************************\n      " +
                "This program will calculate your BMI\n         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
                "\n*********************************" +
                "****************" +
                "");
    }

    public void conclusion() {
        System.out.println("\n*************************************************\n      " +
                "       Thanks for testing! ^_^\n         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
                "\n*********************************" +
                "****************" +
                "");
    }

    public void userDecision() {
        System.out.println("If you would like the program to run input yes otherwise type \"no\" to quit");

        while (true) {
            String userInput = this.reader.nextLine();
            if (userInput.toLowerCase().equals("no")) {
                break;
            } else {
                askUser();
            }
        }
    }

    public void askUser(){
        System.out.print("Please enter the first part of your height in feet: ");
        int userFeet = 0;

        while (true) {
            try {
                userFeet = Integer.parseInt(reader.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("\nPlease try again to enter a number (Hint enter 1 not" +
                        " \"one\"): ");
            }
        }

        int userInches = 0;
        System.out.print("Please enter the second part of your height in inches: ");
        while (true) {
            try {
                userInches = Integer.parseInt(reader.nextLine());
                break;
            } catch (Exception d) {
                System.out.print("\nPlease try again to enter a number (Hint enter 1 not" +
                        " \"one\"): ");
            }
        }

        double userWeight = 0;
        System.out.print("Now please enter your weight in pounds: ");
        while(true) {
            try {
                userWeight = Double.parseDouble(reader.nextLine());
                break;
            } catch(Exception f) {
                System.out.print("\nPlease try again to enter a number (Hint enter 1 not" +
                        " \"one\"): ");
            }
        }
        printResults(userFeet,userInches,userWeight);
    }


    public void printResults(int userFeet, int userInches, Double userWeight){
        double BMI = userStats(userFeet,userInches,userWeight);
        System.out.println("Your BMI is " + String.format("%.2f",BMI) + ".");
        System.out.println("If you would like the program to run again input yes otherwise type \"no\" to quit");
    }


    public static double userStats(double feet, double inches, double weight) {
        double nominator = weight * 703;
        double height = (feet * 12) + (double)inches;
        double denominator = Math.pow (height, 2);
        double bmi = nominator / denominator;
        return  bmi;
    }
}