package Lab.P02_Shapes;
/* @created by Ch.B. on 25-Mar-21 - 20:14 */

public class Rectangle extends Shape{
   private double height;
   private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        if (getArea() == null) {
            double area = height * width;
            setArea(area);
        }

        return getArea();
    }

    @Override
    double calculatePerimeter() {
        if (getPerimeter() == null) {
            double perimeter = height * 2 + width * 2;
            setPerimeter(perimeter);
        }

        return getPerimeter();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
