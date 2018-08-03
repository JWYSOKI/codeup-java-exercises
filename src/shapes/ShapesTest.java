package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(4,2);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable anotherShape = new Rectangle();
        System.out.println(anotherShape.getArea());
        System.out.println(anotherShape.getPerimeter());


    }
}