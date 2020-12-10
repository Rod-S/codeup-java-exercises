package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input1 = new Input();
        double userRadius = input1.getDouble("Enter a radius");
        System.out.println(userRadius);
        Circle circle1 = new Circle(userRadius);
        System.out.println(circle1.getArea());
//        System.out.println(circle1.getCircumference());

    }
}

