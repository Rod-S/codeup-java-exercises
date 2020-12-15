package animals;

public class AnimalTester {

    public static void displayAnimalDetails(Animal a) {
        System.out.println(a.getAnimalInfo());
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(4,"temperate");
        dog1.setFur("short-hair");
        displayAnimalDetails(dog1);
    }
}
