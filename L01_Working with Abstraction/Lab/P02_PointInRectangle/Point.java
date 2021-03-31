package Lab.P02_PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterOrEqualByX(Point other) {
        return this.x >= other.x;
    }

    public boolean isWithEqualsX(Point other) {
        return this.x == other.x;
    }

    public boolean isLessOrEqualByX(Point other) {
        return this.x <= other.x;
    }

    public boolean isGreaterOrEqualByY(Point other) {
        return this.y >= other.y;
    }

    public boolean isWithEqualsY(Point other) {
        return this.y == other.y;
    }

    public boolean isLessOrEqualByY(Point other) {
        return this.y <= other.y;
    }
}
