import java.util.Scanner;



public class HighLow {

    public static int randomRoll(int sideNum) {
        int val = (int) (java.lang.Math.random() * sideNum) + 1;
        return val;
    }

    public static boolean guessingGame() {
        Scanner sc = new Scanner(System.in);
        boolean correctGuess = true;
        int randNum = randomRoll(100);
        while (correctGuess){
            System.out.println("Guess a number between 1 and 100");
            String userInput = sc.nextLine();
            var userNum = Integer.parseInt(userInput);
            System.out.println(randNum);
            if (userNum == randNum) {
                System.out.printf("%d is the correct answer!", userNum);
                correctGuess = false;
                return false;
            } else {
                if (randNum > userNum) {
                    System.out.println("Guess higher");
                    System.out.println("Try again!");
            } else if (randNum < userNum) {
                    System.out.println("Guess lower");
                }
            }
        }
        return true;
    }


    public static void main (String[] args) {
        System.out.println("Hello");
        guessingGame();
    }
}

