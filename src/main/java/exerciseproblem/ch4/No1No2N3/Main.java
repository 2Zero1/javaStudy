package exerciseproblem.ch4.No1No2N3;

/*
No1 : Point 클래스를 만들고 public Point(double x, double y)생산자와 getX, getY접근자 메서드를 정의하라. 또 Point의 서브클래스인 LabeledPoint
를 만들고 public LabeledPoint(String label, double x, double y)생성자와 getLabel 접근자 메서드를 정의하라.

No2 : 연습문제 1에서 만든 Point와 LabeledPoint 클래스에 toString, equals, hashCode 메서드를 정의하라.

No3 : 연습문제 1에서 만든 Point 클래스의 인스턴스 변수 x와 y를 protected로 바꾸어라. LabeledPoint클래스는 오직 LabeledPoint인스턴스에 있는
이 변수에만 접근할 수 있음을 보여라.
 */


import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.println(point.toString());

        LabeledPoint labeledPoint = new LabeledPoint(1,2,"yh");
        System.out.println(labeledPoint.toString());

        //equals
        System.out.println(point.equals(new Point(1,2)));
        System.out.println(point.equals(new Point(1,3)));

        System.out.println(labeledPoint.equals(new LabeledPoint(1,2,"yh")));
        System.out.println(labeledPoint.equals(new LabeledPoint(1,2,"y1h")));

        System.out.println(Objects.equals(point.hashCode(),new Point(1,2).hashCode()));
        System.out.println(Objects.equals(point.hashCode(),new Point(1,3).hashCode()));

        System.out.println(Objects.equals(labeledPoint.hashCode(),new LabeledPoint(1,2,"yh").hashCode()));
        System.out.println(Objects.equals(labeledPoint.hashCode(),new LabeledPoint(1,3,"yh").hashCode()));

        LabeledPoint labeledPoint1 = new LabeledPoint(1,2,"yh");
        labeledPoint.arr[0] = "a";
        labeledPoint1.arr[0] = "a";

        System.out.println(Objects.equals(labeledPoint.hashCode(), labeledPoint1.hashCode()));





    }
}
