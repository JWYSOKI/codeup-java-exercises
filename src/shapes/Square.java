package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, width);
    }

    public Square() {
    }

    @Override
    public void setLength() {
        this.length=length;
        this.width=length;
    }

    @Override
    public void setWidth() {
        this.width=length;
        this.length=length;
    }

    @Override
    public double getPerimeter() {
       return (length*2) + (width*2);
    }

    @Override
    public double getArea() {
     return length*width;
    }
}
