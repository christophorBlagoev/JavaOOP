package Lab.P02_Shapes;
/* @created by Ch.B. on 24-Mar-21 - 12:30 */

public abstract class Shape {
   private Double perimeter;
   private Double area;

    protected Double getPerimeter() {
        return this.perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return this.area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    abstract double calculatePerimeter();

    abstract double calculateArea();
}
