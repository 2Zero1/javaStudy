package exerciseproblem.ch4.No4;

import exerciseproblem.ch4.No1No2N3.Point;

public abstract class Shape {
    Point point;


    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    abstract public Point getCenter();
}
