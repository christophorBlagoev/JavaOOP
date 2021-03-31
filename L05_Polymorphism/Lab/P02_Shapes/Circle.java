package Lab.P02_Shapes;
/* @created by Ch.B. on 25-Mar-21 - 20:14 */

import static java.lang.Math.PI;

public class Circle extends Shape{
   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        if (getArea() == null) {
            double area = PI * radius * radius;
            setArea(area);
        }

        return getArea();
    }

    @Override
    double calculatePerimeter() {
        if (getPerimeter() == null) {
            double perimeter = 2 * PI * radius;
            setPerimeter(perimeter);
        }

        return getPerimeter();
    }

    public final double getRadius() {
        return radius;
    }
}
