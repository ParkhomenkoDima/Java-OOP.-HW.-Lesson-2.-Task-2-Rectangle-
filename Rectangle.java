package OopHomeWork2.Rectangle;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public final double perimeter() {
        return 2 * width + 2 * height;
    }

    public final double square() {
        return width * height;
    }

}
