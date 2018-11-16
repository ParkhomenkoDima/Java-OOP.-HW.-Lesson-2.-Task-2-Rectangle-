package OopHomeWork2.Rectangle;

import java.util.ArrayList;

public class Rectangles {
    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public final void addRect(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public final long sumAllSquare() {
        long sumAllSquare = 0;

        for (Rectangle rectangle : rectangles) {
            sumAllSquare += rectangle.square();
        }

        return sumAllSquare;
    }

    public Rectangle getRectangle (int number){
        return rectangles.get(number);
    }
}
