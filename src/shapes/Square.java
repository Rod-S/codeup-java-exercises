package shapes;

public class Square extends Quadrilateral implements Measurable{

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }


//    protected int sides;

////    public Square(int side) {
////        sides = side;
////    }
//
//    public Square(int side) {
//        super(side, side);
//        sides = side;
//    }
//
//    @Override
//    public int getArea() {
//        return (int) Math.pow(sides, 2);
//        }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * sides;
//    }

}
