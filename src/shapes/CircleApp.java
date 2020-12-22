package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) throws Exception {
        Input input1 = new Input();
        double userRadius = input1.getDouble("Enter a radius");
        System.out.println(userRadius);
        Circle circle1 = new Circle(userRadius);
        System.out.println("circle area: " + circle1.getArea());
        System.out.println("circle circumference: " + circle1.getCircumference());

    }
}

