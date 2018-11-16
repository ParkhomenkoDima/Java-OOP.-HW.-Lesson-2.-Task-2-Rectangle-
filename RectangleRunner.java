package OopHomeWork2.Rectangle;

public class RectangleRunner {
    /*    Написать классы:
        Rectangle (прямоугольник).
        Свойства: ширина, высота.
                Методы: подсчет периметра, подсчет площади.
        Rectangles (прямоугольники).
                Свойства: список прямоугольников.
                Методы: добавление прямоугольника, подсчет суммарной площади всех прямоугольников.
        Клиентский класс RectangleRunner: протестировать функционал предыдущих классов.*/
    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();

        rectangles.addRect(new Rectangle(10,10));
        rectangles.addRect(new Rectangle(20,20));
        rectangles.addRect(new Rectangle(30,30));

        System.out.println("Периметр 1-го прямоугольника: " + rectangles.getRectangle(0).perimeter());
        System.out.println("Площадь 2-го прямоугольника: " + rectangles.getRectangle(1).square());
        System.out.println("Сумма площадей всех прямоугольников: " + rectangles.sumAllSquare());
    }
}
