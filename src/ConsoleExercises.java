import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf("The value of pie is approximately %f%n", pi);


        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

//        System.out.println("Please enter an integer.");
//        int num = sc.nextInt();
//        System.out.printf("%d%n", num);

        System.out.println("Please enter three words.");
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        System.out.printf("Your three words are \n%s \n%s \n%s.\n", first, second, third);
        sc.nextLine();

//        System.out.println("Please enter a sentence.");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

//        System.out.println("Please enter a width");
//        float width = sc.nextFloat();
//        System.out.println("Please enter a length");
//        float length = sc.nextFloat();
//        System.out.println("Please enter a height");
//        float height = sc.nextFloat();
//        float area = width * length;
//        float perimeter = (width * 2) + (length * 2);
//        float volume = width * length * height;
//        System.out.printf("The perimeter of your rectangle is %f%n and your area is %f%n and your volume is %f%n", perimeter, area, volume);
    }
}

