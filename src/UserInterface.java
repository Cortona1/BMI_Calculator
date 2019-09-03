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
    }


    public void introductions() {
        System.out.println("\n*************************************************\n      " +
                "This program will calculate your BMI\n         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
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
                System.out.print("Please enter the first part of your height in feet: ");
                int userFeet = Integer.parseInt(reader.nextLine());
                System.out.print("Please enter the second part of your height in inches: ");
                int userInches = Integer.parseInt(reader.nextLine());
                System.out.print("Now please enter your weight in pounds: ");
                double userWeight = Double.parseDouble(reader.nextLine());
                double BMI = userStats(userFeet,userInches,userWeight);
                System.out.println("Your BMI is " + String.format("%.2f",BMI) + ".");
            }
        }
    }

    public static double userStats(double feet, double inches, double weight) {
        double nominator = weight * 703;
        double height = (feet * 12) + (double)inches;
        double denominator = Math.pow (height, 2);
        double bmi = nominator / denominator;
        return  bmi;
    }
}