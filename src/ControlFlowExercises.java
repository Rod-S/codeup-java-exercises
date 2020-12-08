import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15 ) {
//            System.out.print(i);
//            System.out.print(" ");
//            i++;
//        }
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }
//                while (i>=-10);

//        for (int i =5; i <=15; i++) {
//            System.out.println(i);
//        }
//        for (int i = 100; i>=-10; i-=5) {
//            System.out.println(i);
//        }

//        for (int i =1; i<=100; i++) {
//            if ((i % 3 == 0) & (i % 5 == 0)) {
//                System.out.println(i + " fizzbuzz");
//            } else if (i%3 == 0) {
//                System.out.println(i + " fizz");
//            } else {
//                System.out.println(i + " buzz");
//            }
//        }

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean userContinue = true;
        do {
            System.out.printf("What number would you like to go up to?\n");
            int userInt = sc.nextInt();
            String leftAlignFormat = "%-8d | %-9d | %-4d %n";
            System.out.printf("Here is your table!%n");
            System.out.format("number   | squared   | cubed   %n");
            System.out.format("------   | -------   | -----   %n");
            for (int i = 1; i <= userInt; i++) {
                System.out.format(leftAlignFormat, i, i * i, i * i * i);
            }

            System.out.print("Would you like to continue (y/n)");
            String userResponse = sc.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                 userContinue = false;
            }
        } while (userContinue);


//        while (true) {
//            System.out.println("What is your numerical grade? (Enter an integer.)");
//            int caseSwitch = sc.nextInt();
//            if (caseSwitch <= 100 & caseSwitch >= 88) {
//                System.out.println("A");
//            } else if (caseSwitch <= 87 & caseSwitch >= 80) {
//                System.out.println("B");
//            } else if (caseSwitch <= 79 & caseSwitch >= 67) {
//                System.out.println("C");
//            } else if (caseSwitch <= 66 & caseSwitch >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//            System.out.print("Continue? [Y/N]");
//            String userContinue = sc.next();
//            if (userContinue.equalsIgnoreCase("y")) {
//                continue;
//            } else {
//                break;
//            }
//        }





    }

}
