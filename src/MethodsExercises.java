import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        int product = num1;
        if (num1 <=0 | num2 <=0) {
            for (int i=-1; i>num2; i--) {
                product += num1;
                product = -(product);
            }
        } if (num1 <=0 | num2 <=0) {
            for (int i=-1; i>num2; i--) {
                product += num1;
            }
        } else {
            for (int i =1; i < num2; i++) {
                product += num1;
            }
        }
        return product;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.printf("Enter a number between %d and %max: ", min ,max);
//        String userInput = sc.nextLine();
//        int count = Integer.parseInt(userInput);
//        if (count < min | count > max) {
//            System.out.print("That number is not between 1 and 10. Try Again.");
//            return getInteger(min,max);
//        } else {
//            System.out.printf("%d is valid", count);
//            return count;
//        }
//    }

    public static int calculateFactorial(int num, int currentVal) {
        int currentNum = num;
        if (num > 1) {
            currentVal = currentVal * (num - 1);
            num -= 1;
            return calculateFactorial(num, currentVal);
        } else {
            System.out.printf("factorial is %d", currentVal);
            return currentVal;
        }
    }

    public static int getFactorial(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min ,max);
        String userInput = sc.nextLine();
        int count = Integer.parseInt(userInput);
        if (count < min | count > max) {
            System.out.print("That number is not between 1 and 10. Try Again.");
            return getFactorial(min,max);
        } else {
            System.out.printf("%d is valid", count);
            System.out.println("");
            calculateFactorial(count, count);
            return count;
        }
    }

    public static int randomRoll(int sideNum) {
        int val = (int) (java.lang.Math.random() * sideNum) + 1;
        return val;
    }

    public static int diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of sides for your dice");
        System.out.println("");
        String userInput = sc.nextLine();
        int diceSides = Integer.parseInt(userInput);
        int diceRoll1 = randomRoll(diceSides);
        int diceRoll2 = randomRoll(diceSides);
        System.out.printf("Roll Dice! Roll1: %d Roll2: %d", diceRoll1, diceRoll2);
        return diceRoll1 + diceRoll2;
    }

    public static void main(String[] args) {

        System.out.println("addition: " + addition(1, 2));
        System.out.println("subtraction: " + subtraction(2, 1));
        System.out.println("multiplication: " + multiplication(-2,-2));
        System.out.println("division: " + division(4,2));
        System.out.println("modulus: " + modulus(4,1));
//        getInteger(1,10);
//        getFactorial(1,10);
        diceRoll();
    }
}
