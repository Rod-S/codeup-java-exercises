package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static double totalGradeSize;
    public static String userNameString = "";

    public static void getAllGrades(HashMap<String, Student> students) {
        students.forEach((key, value) -> {
                System.out.println("|" + key + "|");
            System.out.println("Grades: " + Arrays.toString(value.getGrades()));
                }
        );
    }

    public static double getClassAverage(HashMap<String, Student> students) {
        students.forEach((key, value) -> totalGradeSize += value.getGradeAverage());
        System.out.println(totalGradeSize / students.size());
        return totalGradeSize / students.size();
    }

    public static void terminalCommand(HashMap<String, Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Here are The GitHub usernames of our students: \n");
        students.forEach((key, value) -> userNameString += " | " + key + " | ");
        System.out.println(userNameString);
        boolean userContinue = true;
        System.out.println("\nEnter an option: ");
        System.out.println("(1) View all students Grades.");
        System.out.println("(2) View class grade average.");
        System.out.println("(3) View information on a specific student.");
        int selectInputNum = sc.nextInt();
        switch(selectInputNum) {
            case 1:
                System.out.println("\nHere are the grades for all students: ");
                System.out.println();
                do {
                    getAllGrades(students);
                    System.out.println("\nWould you like to view all student grades again? 'y'/'n' ");
                    String userContinueInput = sc.nextLine();
                    userContinue = userContinueInput.equalsIgnoreCase("y");
                } while (userContinue);
                break;
            case 2:
                getClassAverage(students);
                break;
            case 3:
                do {
                    System.out.println("\nWhat student would you like to see more information on?");
                    String userInput = sc.nextLine();
                    if (!students.containsKey(userInput)) {
                        System.out.println("\nSorry, no student found with the GitHub username of \"" + userInput + "\"");
                    } else {
                        System.out.println("Name: " + students.get(userInput).getName() + " - " + "GitHub Username: " + userInput);
                        System.out.println("Student's grades: " + Arrays.toString(students.get(userInput).getGrades()));
                        System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                    }
                    System.out.println("\nWould you like to see another student? 'y'/'n' ");
                    String userContinueInput = sc.nextLine();
                    userContinue = userContinueInput.equalsIgnoreCase("y");
                } while (userContinue);
                System.out.println("Goodbye, and have a wonderful day!");
                break;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student rod = new Student("Rod");
        rod.addGrade(100);
        rod.addGrade(95);
        rod.addGrade(90);

        Student john = new Student("John");
        john.addGrade(90);
        john.addGrade(85);
        john.addGrade(100);

        Student jones = new Student("Jones");
        jones.addGrade(90);
        jones.addGrade(85);
        jones.addGrade(80);

        Student jane = new Student ("Jane");
        jane.addGrade(90);
        jane.addGrade(75);
        jane.addGrade(99);

        students.put("rod-s", rod);
        students.put("johnJ", john);
        students.put("jonesy", jones);
        students.put("janedoe", jane);

        GradesApplication.terminalCommand(students);
    }
}
