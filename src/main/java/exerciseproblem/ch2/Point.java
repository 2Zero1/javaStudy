package exerciseproblem.ch2;

/**
 * <code>Point</code> 2차원의 점을 표현 하는 객체이다.
 * @author 이영한
 * @version 1.1
 */
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    /**
     * <code>Point 생성자</code> 입력한 매개변수에 맞는 좌표를 갖는 Point 객체를 만든다.
     * @param x x좌표
     * @param y y좌표
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * x좌표를 반환한다.
     * @return x좌표
     */
    public int getX() {
        return x;
    }
    /**
     * y좌표를 반환한다.
     * @return y좌표
     */
    public int getY() {
        return y;
    }

    /**
     * 입력값 만큼 좌표를 이동한다.
     * @param x
     * @param y
     */
    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

    /**
     * 입력값 만큼 각 좌표를 곱해준다.
     * @param x
     * @param y
     */
    public void scale(int x, int y) {
        this.x *= x;
        this.y *= y;
    }
//    public Point translate(int x, int y) {
//        return new Point(this.x + x, this.y + y);
//    }
//
//    public Point scale(int x, int y) {
//        return new Point(this.x * x, this.y * y);
//    }
}
