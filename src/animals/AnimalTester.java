package animals;

public class AnimalTester {

    public static void displayAnimalDetails(Animal a) {
        System.out.println(a.getAnimalInfo());
    }

    public static void main(String[] args) {
//        Dog dog1 = new Dog(4,"temperate");
//        dog1.setFur("short-hair");
//        displayAnimalDetails(dog1);

        Penguin peng1 = new Penguin(2, "warm");
        displayAnimalDetails(peng1);
        Macaw mac1 = new Macaw(2, "warm");
        displayAnimalDetails(mac1);
        mac1.fly();
    }
}
