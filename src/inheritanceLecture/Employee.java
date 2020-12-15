package inheritanceLecture;
import util.Input;

public class Employee {
    public String name;
    public int id;

    public Employee() {

    }
    public Employee(String name) {
        this.name = name;
    }

    public void doWork(){
        System.out.println("Working... working...");
    }

    public String getName() {
        return name;
    }


    public int getId(){
        return id;
    }
}
