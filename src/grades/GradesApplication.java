package grades;

import util.Input;

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

    public static void getClassAverage(HashMap<String, Student> students) {
        totalGradeSize = 0;
        students.forEach((key, value) -> totalGradeSize += value.getGradeAverage());
        System.out.println("Class average: " + totalGradeSize / students.size());
    }

    public static void displayMenu(HashMap<String, Student> students) {
        userNameString = "";
        System.out.println("Here are The GitHub usernames of our students: \n");
        students.forEach((key, value) -> userNameString += "|" + key + "| ");
        System.out.println(userNameString);
        System.out.println("\nEnter an option: ");
        System.out.println("(1) View all students Grades.");
        System.out.println("(2) View class grade average.");
        System.out.println("(3) View grade(s) of a specific student.");
        System.out.println("(4) Print CSV report of all students.");
        System.out.println("(5) Exit");
    }

    public static void terminalCommand(HashMap<String, Student> students) {
        Scanner sc = new Scanner(System.in);
        Input userInput = new Input();
        boolean continueTerminalCommand = true;
        boolean continueStudentSelect;
        int selectInputNum;
        System.out.println("Welcome!\n");
        do {
            displayMenu(students);
            boolean userContinue;
            selectInputNum = sc.nextInt();
            switch (selectInputNum) {
                case 1:
                    do {
                        System.out.println("\nHere are the grades for all students: ");
                        System. out.println();
                        getAllGrades(students);
                        System.out.println("\nWould you like to view all student grades again? 'y'/'n' ");
                        String userContinueInput = sc.next();
                        userContinue = userContinueInput.equalsIgnoreCase("y");
                        System.out.println(userContinue);
                    } while (userContinue);
                    break;
                case 2:
                    getClassAverage(students);
                    System.out.println("Enter a key to return to the menu.");
                    sc.next();
                    break;
                case 3:
                    do {
                        System.out.println("\nWhat student would you like to see more information on?");
                        String studentSelection = userInput.getString();
                        if (!students.containsKey(studentSelection)) {
                            System.out.println("\nSorry, no student found with the GitHub username of \"" + studentSelection + "\"");
                        } else {
                            System.out.println("Name: " + students.get(studentSelection).getName() + " - " + "GitHub Username: " + studentSelection);
                            System.out.println("Student's grades: " + Arrays.toString(students.get(studentSelection).getGrades()));
                            System.out.println("Current Average: " + students.get(studentSelection).getGradeAverage());
                        }
                        System.out.println("\nWould you like to see another student? 'y'/'n' ");
                        String userContinueInput = sc.next();
                        continueStudentSelect = userContinueInput.equalsIgnoreCase("y");
                    } while (continueStudentSelect);
                    break;
                case 4:
                    System.out.println("name,github_username,average");
                    students.forEach((key, value) -> System.out.println(students.get(key).getName() + "," + key + "," + students.get(key).getGradeAverage()));
                    System.out.println("Enter a key to return to the menu.");
                    sc.next();
                    break;
                case 5:
                    continueTerminalCommand = false;
                    break;
                default:
                    System.out.println("Invalid entry. Try again.");
            }
        } while (continueTerminalCommand);
        System.out.println("Goodbye, and have a wonderful day!");
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
