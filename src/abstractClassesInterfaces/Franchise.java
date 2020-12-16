package abstractClassesInterfaces;

//I am declaring this to be an abstract class
public abstract class Franchise {
    //All the methods in an abstract class are like a list
    // of rules or requirements for what needs to be implemented
    // in  any class that **extends** this abstract class

    //If we were to create a class that extends a Franchise
    // ie McDonald's on I-10 vs. McDonald's on Loop 1604


    //Properties (constant values)
    private final String companyName = "McDonalds";
    private String managerName;

    //If we have enough properties to warrant a constructor - to set those
    //values when initializing this class - let's create that here
    public Franchise(String managerName){
        //we don't have to set companyName because it is already final
        this.managerName = managerName;
    }

    //Methods
    public abstract void broilStuff(String menuItem); //broilStuff("bigMac")
    //for example, 8AM = 800, 10pm = 2200
    public abstract void businessHours(int openTime, int closeTime);

    //non-void method
    public abstract boolean iceCreamMachineWorking();

    //non-abstract method
    public void greetCustomer() {
        //we have to write out the method body, because we did NOT use
//        the abstract keyword when declaring the method
        System.out.println("Welcome to McDonald's. Enjoy your meal");
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
