package exerciseproblem.ch4.No4;

/*
Shape 추상 클래스를 정의하라. 이 클래스는 Point 클래스에 인스턴스 변수, 생성자, 지정한 양만큼 점을 옮기는 구체적인 public void moveBy(double dx,
double dy) 메서드, public Point getCenter() 추상 메서드를 작성 해야한다. Circle, Rectangle, Line 서브 클래스를 구체적으로 정의하고 각각
public Circle(Point center, double radius), public Rectangle(Point topLeft, double width, double height),
public Line(Point from, Point to) 생성자를 포함하도록 만들어라.
 */

import exerciseproblem.ch4.No1No2N3.Point;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point zero = new Point(0,0);
        Line line = new Line(new Point(0,0), new Point(4,4));
        System.out.println(line.getCenter());

        Circle circle = new Circle(zero,10);
        System.out.println(circle.getCenter());

        Rectangle rectangle = new Rectangle(zero,4, 4);
        System.out.println(rectangle.getCenter());

        System.out.println(Objects.equals(circle,circle.clone()));
        System.out.println("=====");
        System.out.println(Objects.equals(circle.point,circle.clone().point));

        Point point = new Point(1,2);
//        System.out.println(point);
        Point point1 = point.clone();
        point1.setX(2);
        System.out.println(point);
        System.out.println(point1);
        System.out.println(Objects.equals(point, point.clone()));

        Line line1 = (Line)line.clone();
        System.out.println(Objects.equals(line, line.clone()));
        System.out.println(Objects.equals(line.from, line1.from));


    }

}
