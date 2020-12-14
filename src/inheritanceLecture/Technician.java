package inheritanceLecture;

import java.sql.SQLOutput;

public class Technician {
    private String name;

    public Technician(String name) {
        this.name = name;
    }

    public Car repair(Car theCar) {
        System.out.println("Repairing the car...");
        return theCar;
    }

    public static void main(String[] args) {
        Technician Bob = new Technician("Bob");

        //Don't need separate classes for each car type,
        // which would need separate methods for each. Extend Car instead of Toyota toyota Ford ford
    Car toyota = new Toyota();
    Car ford = new Ford();
    Car chevy = new Chevy();

    Bob.repair(toyota);
    Bob.repair(ford);
    Bob.repair(chevy);



    }

}
