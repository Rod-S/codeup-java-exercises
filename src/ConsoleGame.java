import java.util.Scanner;

public class ConsoleGame {

    public static void startScreen() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Oh, chosen one.\n");
        Thread.sleep(2000);
        System.out.printf("This land has waited countless ages until a hero would appear...\n");
        Thread.sleep(2000);
        System.out.printf("What is your name, hero?\n");
        String userInput = sc.nextLine();
        System.out.printf("'%s', you say?\n", userInput);
        Thread.sleep(2000);
        System.out.printf("Yes... you shall be our hero.\n");
        Thread.sleep(2000);
        System.out.println("Now go! Your adventure now begins!");
        Thread.sleep(4000);
    }

    public static void displayScreen() {

        String leftAlignFormat = "%-20s %-8s | %-81s | %-8s %n";
        System.out.format("                     ------   |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯| ------   %n");
        System.out.format("                     ------   |                                                                                   | ------   %n");
    }

    public static void blankScreen(int num, String level) {
        String leftAlignFormat = "%-20s %-8s | %-81s | %-8s %n";
        String levelAlignFormat = "%-18s | %-37s %-51s    | %-8s %n";
        System.out.format("                     ------   |                                                                                   | ------   %n");
        for (int i = 1; i <= 7; i++) {
                System.out.format(leftAlignFormat,"", "------", "", "------");
            }
        System.out.format(levelAlignFormat,"" , "------", "Current Level: " + level, "------");
        for (int i = 1; i <= 8; i++) {
            System.out.format(leftAlignFormat,"", "------", "", "------");
        }
        System.out.format("                     ------   |___________________________________________________________________________________| ------   %n");

    }

    public static void hud() {
        String leftAlignFormat = "%-20s %-8s | %-81s | %-8s %n";

        System.out.format("                     ------   |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯| ------   %n");
        System.out.format("                     ------   |  PLAYER STATUS                                                      ENEMY STATUS  | ------   %n");
        System.out.format("                     ------   |  HP:                                                                HP:           | ------   %n");
        System.out.format("                     ------   |  MP:                                                                MP:           | ------   %n");
        System.out.format("                     ------   |                                                                                   | ------   %n");
        System.out.format("                     ------   |___________________________________________________________________________________| ------   %n");
    }

    public static void monster() {
        String leftAlignFormat = "%-20s %-8s | %-1s | %-8s %n";
        System.out.format("                     ------   |                               (\\               /)                                 | ------   %n");
        System.out.format("                     ------   |                              __)\\             /(__                                | ------   %n");
        System.out.format("                     ------   |                             __)_ \\  (\\!~!/)  / _(__                               | ------   %n");
        System.out.format("                     ------   |                            __)_ `.\\  )d b(  /.' _(__                              | ------   %n");
        System.out.format("                     ------   |                          ___)_ `. \\\\(  _  )// .' _(___                            | ------   %n");
        System.out.format("                     ------   |                           )_  `. \\  ((q_p))  / .'  _(_                            | ------   %n");
        System.out.format("                     ------   |                           _)`.  \\  ,-)\\_/(-.  /  .'(_                             | ------   %n");
        System.out.format("                     ------   |                            _) ,-._/v/vvvvv\\v\\_,-. (_                              | ------   %n");
        System.out.format("                     ------   |                            _)///(._/v(___)v\\_.)\\\\\\(_                              | ------   %n");
        System.out.format("                     ------   |                             \\_ ___/v(_____)v\\___ _/                               | ------   %n");
        System.out.format("                     ------   |                               /vvv\\(_______)/vvv\\                                 | ------   %n");
        System.out.format("                     ------   |                               \\vvv/v(_____)v\\vvv/                                 | ------   %n");
        System.out.format("                     ------   |                               _\\vv\\\\v(___)v//vv/_                                 | ------   %n");
        System.out.format("                     ------   |                              '>_`  \\`-._.-'/  '_<`                                | ------   %n");
        System.out.format("                     ------   |                              ' >_,-'       `-._<`                                 | ------   %n");
    }

    public static void gameOver() {
        System.out.format("                     ------   |          _;~)                  (~;_                       | ------   %n");
        System.out.format("                     ------   |        (   |                  |   )                       | ------   %n");
        System.out.format("                     ------   |          ~', ',    ,''~'',   ,' ,'~                            | ------   %n");
        System.out.format("                     ------   |              ', ','       ',' ,'                           | ------   %n");
        System.out.format("                     ------   |                ',: {'} {'} :,'                                       | ------   %n");
//        System.out.format("                     ------   |                  ;   /^\   ;                                           | ------   %n");
//        System.out.format("                     ------   |                   ~\  ~  /~                                          | ------   %n");
        System.out.format("                     ------   |                 ,' ,~~~~~, ',                                                     | ------   %n");
        System.out.format("                     ------   |               ,' ,' ;~~~; ', ',                                                   | ------   %n");
        System.out.format("                     ------   |             ,' ,'    '''    ', ',                                                 | ------   %n");
        System.out.format("                     ------   |           (~  ;               ;  ~)                                               | ------   %n");
        System.out.format("                     ------   |            -;_)               (_;-                                                | ------   %n");
    }

    public static void boss() {
        String leftAlignFormat = "%-20s %-8s | %-1s | %-8s %n";
        System.out.format("                     ------   |                               (\\               /)                                 | ------   %n");
        System.out.format("                     ------   |                              __)\\             /(__                                | ------   %n");
        System.out.format("                     ------   |                             __)_ \\  (\\!~!/)  / _(__                               | ------   %n");
        System.out.format("                     ------   |                            __)_ `.\\  )d b(  /.' _(__                              | ------   %n");
        System.out.format("                     ------   |                          ___)_ `. \\\\(  _  )// .' _(___                            | ------   %n");
        System.out.format("                     ------   |                           )_  `. \\  ((q_p))  / .'  _(_                            | ------   %n");
        System.out.format("                     ------   |                           _)`.  \\  ,-)\\_/(-.  /  .'(_                             | ------   %n");
        System.out.format("                     ------   |                            _) ,-._/v/vvvvv\\v\\_,-. (_                              | ------   %n");
        System.out.format("                     ------   |                            _)///(._/v(___)v\\_.)\\\\\\(_                              | ------   %n");
        System.out.format("                     ------   |                             \\_ ___/v(_____)v\\___ _/                               | ------   %n");
        System.out.format("                     ------   |                               /vvv\\(_______)/vvv\\                                 | ------   %n");
        System.out.format("                     ------   |                               \\vvv/v(_____)v\\vvv/                                 | ------   %n");
        System.out.format("                     ------   |                               _\\vv\\\\v(___)v//vv/_                                 | ------   %n");
        System.out.format("                     ------   |                              '>_`  \\`-._.-'/  '_<`                                | ------   %n");
        System.out.format("                     ------   |                              ' >_,-'       `-._<`                                 | ------   %n");
    }
    public static void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        startScreen();
        displayScreen();
        blankScreen(5, "Spooky Dungeon");
        pressAnyKeyToContinue();
        displayScreen();
        boss();
        hud();

    }
}
























