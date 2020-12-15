package animals;

public class Dog extends Animal{
    private String fur;

    public Dog(int numLegs, String prefClimate) {
        super(numLegs, prefClimate);
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public String getFur() {
        return this.fur;
    }

    public String bark() {
        return "woof woof!";
    }

    public String getAnimalInfo() {
        return getNumberOfLegs() + " " + getPreferredClimate() + " " + getFur();
    }

}
