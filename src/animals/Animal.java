package animals;

public class Animal {
    private int numberOfLegs;
    private String preferredClimate;

    public Animal(int numLegs, String prefClimate) {
        this.numberOfLegs = numLegs;
        this.preferredClimate = prefClimate;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public String getPreferredClimate() {
        return this.preferredClimate;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }

    public String getAnimalInfo() {
        return numberOfLegs + " " + preferredClimate;
    }
}
