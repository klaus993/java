package shapes;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Rectangle extends Shape {

    protected double length;
    protected double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
