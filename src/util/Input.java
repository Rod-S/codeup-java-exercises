package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public int getInt() throws Exception {
       try {
           return Integer.valueOf(getString());
       } catch (Exception e) {
           e.printStackTrace();
           throw new Exception("Input value is not an integer.");
       }
    }

    public int getInt(String prompt) throws Exception {
        System.out.println(prompt);
        return getInt();
    }

    public double getDouble() throws Exception {
        try {
            return Double.valueOf(getString());
        } catch (Exception e) {
            e.printStackTrace();
            return getDouble("Input value is not a double. Try again.");
//            throw new Exception("Input value is not a double.");
        }
    }

    public double getDouble(String prompt) throws Exception {
        System.out.println(prompt);
        return getDouble();
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
        return (userInput.equals("y") | userInput.equals("yes"));
    }

    public int getInt(int min, int max) throws Exception {
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

    public int getInt(int min, int max, String prompt) throws Exception {
        System.out.printf("%s %d and %d", prompt, min, max);
        return getInt(min, max);
    }
//

//
    public double getDouble(double min, double max) throws Exception {
//        System.out.printf("Enter a number between %f and %f", min, max);
        double userInput = getDouble();
        if (userInput < min | userInput > max) {
            System.out.println("Number is not in range. Try again.");
            return getDouble(min, max);
        } else {
            System.out.printf("%f is within %f and %f!", userInput, min, max);
        }
        return userInput;
    }

    public double getDouble(double min, double max, String prompt) throws Exception {
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

    public long getBinary() throws Exception {
        try {
            System.out.println("Please enter a binary number.");
            return Long.valueOf(getString(), 2);
        } catch (Exception e) {
            e.printStackTrace();
            return getBinary("Input value is not a binary number. Try again.");
        }
    }
        public long getBinary(String prompt) throws Exception {
            System.out.println(prompt);
            return getBinary();
        }

    public long getHexadecimal() throws Exception {
        try {
            System.out.println("Please enter a hexadecimal number.");
            return Long.valueOf(getString(), 16);
        } catch (Exception e) {
            e.printStackTrace();
            return getBinary("Input value is not a Hexadecimal number. Try again.");
        }
    }
    public long getHexadecimal(String prompt) throws Exception {
        System.out.println(prompt);
        return getBinary();
    }
}
