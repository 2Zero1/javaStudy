package exerciseproblem.ch2;

/**
 * <code> Solve No5 6 7 Practice</code> 문제 5번 6번 7번을 풀었다.
 *
 * #author 이영한
 * #version 1.1
 *
 */

public class No5and6and7 {

    /**
     * 코드를 실행한다.
     * @param args
     */
    public static void main(String[] args) {
        Point point = new Point(1,1);
        System.out.println(point.getX());
        point.translate(2,2);
//        Point b = point.translate(2,2);
        System.out.println(point.getX());

        point.scale(2,2);
//        Point c = point.scale(2,2);
        System.out.println(point.getX());
    }



}

/*
평면에 놓인 점을 기술하는 불변 클래스 Point를 구현하라. 특정 점으로 설정하는 생성자와 원점으로 설정하는 인수 없는 생성자, getX, getY, translate, scale
메서드를 구현하라. translate 메서드는 x와 y방향으로 주어진 길이만큼 점을 옮긴다. scale 메서드는 주어진 비율로 두 좌표의 크기를 조절한다. 결과로
새로운 점을 반환하도록 이 메서드들을 구현하라. 예를 들어 다음 문장은 p를 (2, 3.5) 좌표에 있는 점으로 설정해야한다.
Point p = new Point(3, 4).translate(1, 3).scale(0.5);

1. 원점으로 생성하는 생성자
2. 특정 값을 설정한 생성자
3. getX
4. getY
5. translate 메서드는 주어진 x와 y 방향으로 이동
6. scale 메서드는 주어진 비율로 두 좌표의 크기를 조절한다.
 */

