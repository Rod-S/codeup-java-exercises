package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.nextLine();
    }

    public String getString(String prompt) {
        return sc.nextLine();
    }

    public int getInt() {
        return sc.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public double getDouble() {
        return sc.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public boolean yesNo() {
        System.out.println();
        String userInput = getString().toLowerCase();
        if (userInput.equals("y") | userInput.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.printf("%s", prompt);
        String userInput = getString().toLowerCase();
        if (userInput.equals("y") | userInput.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
//        System.out.printf("Enter a number between %d and %d", min, max);
        int userInput = getInt();
        if (userInput < min | userInput > max) {
            System.out.println("Number is not in range. Try again.");
            getInt(min, max);
        } else {
            System.out.printf("%d is within %d and %d!", userInput, min, max);
        }
        return userInput;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.printf("%s %d and %d", prompt, min, max);
        return getInt(min, max);
    }
//

//
    public double getDouble(double min, double max) {
//        System.out.printf("Enter a number between %f and %f", min, max);
        double userInput = getDouble();
        if (userInput < min | userInput > max) {
            System.out.println("Number is not in range. Try again.");
            getDouble(min, max);
        } else {
            System.out.printf("%f is within %f and %f!", userInput, min, max);
        }
        return userInput;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.printf("%s %f and %f", prompt, min, max);
        double userInput = getDouble();
        if (userInput < min | userInput > max) {
            System.out.println("Number is not in range. Try again.");
            getDouble(min, max);
        } else {
            System.out.printf("%f is within %f and %f!", userInput, min, max);
        }
        return userInput;
    }


}
