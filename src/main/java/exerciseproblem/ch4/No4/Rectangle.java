package exerciseproblem.ch4.No4;

import exerciseproblem.ch4.No1No2N3.Point;

public class Rectangle extends Shape implements Cloneable{
    Point topLeft;
    double width;
    double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rectangle rectangle = (Rectangle) super.clone();
        rectangle.topLeft = this.topLeft.clone();
        rectangle.height = this.height;
        rectangle.width = this.width;

        return rectangle;
    }

    @Override
    public Point getCenter() {

        return new Point(topLeft.getX() + width/2, topLeft.getY() - height/2);
    }
}
