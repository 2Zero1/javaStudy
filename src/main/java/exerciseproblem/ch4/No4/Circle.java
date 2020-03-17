package exerciseproblem.ch4.No4;

import exerciseproblem.ch4.No1No2N3.Point;

public class Circle extends Shape implements Cloneable{
    Point point;
    double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.point = point;
        this.radius = radius;
    }
    public Circle clone() throws CloneNotSupportedException {
        Circle circle = (Circle)super.clone();
        circle.radius = radius;
        circle.point = point.clone();
        return circle;
    }



    @Override
    public Point getCenter() {
        return point;
    }
}
