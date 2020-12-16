package abstractClassesInterfaces;

//Delcaring this as an 'interface'
public interface McFranchise {
    // Properties

    String CompanyName = "McDonald's"; // this String is a constant
//    String managerName =

    //Abstract Methods (that we have to completely write out in any class
    //abstract = have to write out this method When you EXTEND/IMPLEMENT the abstract class/interface

    // static method = need to define it fully, so that when you call it (i.e Franchise.broilStuff(...),
    // it knows how to process its data
    public void broilStuff(String menuItem);
    public void businessHours(int openTime, int closeTime);
    public String iceCreamMachineWorking();
    //that IMPLEMENTS this interface


}
