import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean userContinue = true;

            do {
                System.out.println("Ask Bob a question.");
                String question1 = sc.nextLine();
                if (question1.endsWith(("?"))) {
                    System.out.println("Sure.");
                } else if (question1.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (question1.trim().equalsIgnoreCase("")) {
                    System.out.println("Fine, be that way!");
                } else {
                    System.out.println("Whatever.");
                }
                System.out.println("Would you like to ask another question? [y/n]");
                String userContinueResponse = sc.nextLine();
                if (userContinueResponse.equalsIgnoreCase("n")) {
                    break;
                } else {
                    continue;
                }
            }
            while (userContinue);
    }
}
