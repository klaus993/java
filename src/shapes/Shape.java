package shapes;

/**
 * Created by Klaus on 3/4/2017.
 */
public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {

        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[Color=" + this.getColor() + ",Filled=" + this.isFilled() + "]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
