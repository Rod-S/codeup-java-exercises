package inheritanceLecture;

public class Teacher extends Employee{

    public Teacher() {

    }
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("Teaching students...");
    }

    public static void main(String[] args) {
        Teacher Jane = new Teacher("Jane");
        Jane.doWork();
        Jane.getName();
    }
}
