package shapes;

public class Square extends Rectangle{
    protected int sides;

//    public Square(int side) {
//        sides = side;
//    }

    public Square(int side) {
        super(side, side);
        sides = side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(sides, 2);
        }

    @Override
    public int getPerimeter() {
        return 4 * sides;
    }

}
