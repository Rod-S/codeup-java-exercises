package inheritanceLecture;

public class Developer extends Employee{
    public Developer() {

    }

    public Developer(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Employee Bob = new Employee();
        Bob.doWork();

        Developer John = new Developer();
        John.doWork();
    }
}
