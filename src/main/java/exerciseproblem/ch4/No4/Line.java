package exerciseproblem.ch4.No4;

import exerciseproblem.ch4.No1No2N3.Point;

public class Line extends Shape implements Cloneable{
    Point from;
    Point to;

    public Line(Point from, Point to) {
        super(from);
        this.from = from;
        this.to = to;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Line line = (Line) super.clone();
        line.from = this.from.clone();
        line.to = this.to.clone();

        return line;
    }

    @Override
    public Point getCenter() {
        return new Point((from.getX() + to.getX()) / 2,  (from.getY() + to.getY())/2);
    }
}
