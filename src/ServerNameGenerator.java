public class ServerNameGenerator {

     public String[] nouns = {"dog", "cat", "fish", "cow", "chicken", "goat", "horse", "sheep", "pig", "bunny"};

     public String[] adjectives = {"happy", "colorful", "lax", "bright", "cold", "hot", "alert", "drowsy", "pumped", "energized"};

    public int randomNum(int num) {
        int val = (int) (java.lang.Math.random() * num) + 1;
        return val;
    }

    public String ServerNameGenerator(String[] array) {
//        System.out.println(array[randomNum(array.length)]);
        return array[randomNum(array.length)];
    }

    public static void main(String[] args) {
       ServerNameGenerator noun1 = new ServerNameGenerator();
        ServerNameGenerator adjective1 = new ServerNameGenerator();
        String randomNoun1 = noun1.nouns[noun1.randomNum(noun1.nouns.length)];
        String randomAdj1 = adjective1.adjectives[adjective1.randomNum(adjective1.adjectives.length)];
        System.out.print("Here is your server name: \n" + randomNoun1 +"-"+ randomAdj1);
    }

}
