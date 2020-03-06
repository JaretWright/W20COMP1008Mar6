import java.util.ArrayList;

public class ShapeTesting {
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(20,20);
        Circle circle = new Circle(20);

        ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);

        for (TwoDimensionalShape shape:shapes)
            System.out.printf("%s has area: %.2f%n", shape, shape.getArea());
    }
}
