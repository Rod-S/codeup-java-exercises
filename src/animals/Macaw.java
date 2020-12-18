package animals;

public class Macaw extends Bird implements Flyable{


    public Macaw(int numLegs, String prefClimate) {
        super(numLegs, prefClimate);
    }

    @Override
    public void fly() {
        System.out.println("Macaw flying high");
    }
}
