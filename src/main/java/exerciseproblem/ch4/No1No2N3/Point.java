package exerciseproblem.ch4.No1No2N3;

import java.util.Objects;

public class Point implements Cloneable{
    protected double x;
    protected double y;
    private int test;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        //this로 현재 내부에 존재하는 멤버에 접근할 수 있다. 자식 클래스에 의해 불리더라도 접근할 수 있는 멤버는 동일하다 하지만, 클래스 내부는 자식 클래스 정보를 갖는다.
//        System.out.println(this.getClass().getSimpleName() + obj.getClass().getSimpleName());
        // 두 객체가 동일한지 알아보는 빠른 검사
        if(this != obj) return false;
//        if(this == obj) return true;

        // 매개변수가 null이면 false를 반환해야함.
        if (obj == null) return false;

        //obj가 Point의 인스턴스인지 검사.
        if (getClass() != obj.getClass()) return false;

        //인스턴스의 값이 동일한지 검사.
        Point point = (Point)obj;

        return this.x == point.x && this.y == point.y;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" [x = "+this.x+", y = "+y+"]";
    }
}
