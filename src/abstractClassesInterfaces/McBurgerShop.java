package abstractClassesInterfaces;

import java.util.ArrayList;
import java.util.List;

public class McBurgerShop implements McFranchise {

    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;


    public static void main(String[] args) {
        //Let's try to access some of a McBurgerShop's items / methods
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Big Mac");
        theseMenuItems.add("French Fries");
        theseMenuItems.add("Quarter Pounder");
        List<String> theseCategories = new ArrayList<>();
        theseCategories.add("Entrees");
        theseCategories.add("Sides");
        theseCategories.add("Drinks");
        McBurgerShop mcDonaldsDallas = new McBurgerShop(theseMenuItems, theseCategories, 200, 800, 2300, true);

        // Loop through all of the menu items and print each one of them to the screen
        for(String thisItem : mcDonaldsDallas.getMenuItems()) {
            //Looking at one menu item at a time
            mcDonaldsDallas.broilStuff(thisItem);
            System.out.println("Menu Item: " + thisItem);
        }

        AustinMcD austinMcDonalds = new AustinMcD(theseMenuItems, theseCategories, 200, 800, 2300, true);
        for (String thisItem : austinMcDonalds.getMenuItems()) {
            austinMcDonalds.broilStuff(thisItem);
        }
    }

    //Constructor (for McBurgerShop)
    public McBurgerShop(List<String> menuItems, List<String>menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;

    }

    //Overrides

    @Override
    public void broilStuff(String menuItem) {
        System.out.println("The kitchen just cooked an order of: " + menuItem + ".");
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.println("We are open from " + openTime + " " + "to " + closeTime);

    }

    @Override
    public String iceCreamMachineWorking() {
        if (this.iceCreamTime) {
            return "Time for ice cream!";
        }
        return "No ice cream for you:(";
    }

    //Getters and Setters

    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(List<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isIceCreamTime() {
        return iceCreamTime;
    }

    public void setIceCreamTime(boolean iceCreamTime) {
        this.iceCreamTime = iceCreamTime;
    }
}
