package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    protected int getLength() {
        return length;
    }

    protected int getWidth() {
        return width;
    }

//    public double getPerimeter() {
//        return 4 * 4;
//    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}
