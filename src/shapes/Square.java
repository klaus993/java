package shapes;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public String toString() {
        return "Square" + " " + super.toString();
    }
}
