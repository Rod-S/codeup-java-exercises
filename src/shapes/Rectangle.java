package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        super.length = length;
    }

    @Override
    public void setWidth(int width) {
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * getLength() + 2 * getWidth();
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

//    protected int length;
//    protected int width;

//    //    public Rectangle() {
////    }
//
//    Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//
//
//    public int getArea() {
//            return length * width;
//        }
//
//        public int getPerimeter() {
//            return 2 * length + 2 * width;
//    }

}
