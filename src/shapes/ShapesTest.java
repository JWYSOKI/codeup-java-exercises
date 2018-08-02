package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(4,2);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable anotherShape = new Quadrilateral(2, 4) {
            @Override
            public void setLength() {

            }

            @Override
            public void setWidth() {

            }

            @Override
            public double getPerimeter() {
                return this.length;
            }

            @Override
            public double getArea() {
                return 0;
            }
        }

        System.out.println(anotherShape.getArea());
        System.out.println(anotherShape.getPerimeter());


    }
}