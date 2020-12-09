package oopLecture;
//Create a class called Dish. This class will represent various restaurant dishes.
//        Include an integer property called “costInCents”
//        Include a string property called “nameOfDish”
//        Include a boolean property called “wouldRecommend”
//        Include a method called “printSummary” with a void return type
//        this method will use a single printf method to print out the values of each of the instance properties in the following format:
//        Cost: COST_IN_CENTS_HERE
//        Name: NAME_OF_DISH_HERE
//        Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//        Create another class called DishTest
//        Add a main method and inside the method...
//        1) instantiate a Dish object and assign to a variable called dish1
//        2) assign creative values for each of the properties
//        3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
public class DishTest {

//    public static float convertToDollars(Dish nameOfDish, int costInCents) {
//        return costInCents / 100;
//    }

    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 500;
        dish1.nameOfDish = "pizza";
        dish1.wouldRecommend = true;
        dish1.printSummary();
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);

        Dish dish2 = new Dish();
        dish2.costInCents = 1000;
        dish2.nameOfDish = "spaghetti";
        dish2.wouldRecommend = false;
        dish1.printSummary();
        DishTools.shoutDishName(dish2);
        DishTools.analyzeDishCost(dish2);
        DishTools.flipRecommendation(dish2);
    }
}
