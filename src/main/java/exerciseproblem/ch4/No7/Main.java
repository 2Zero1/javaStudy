package exerciseproblem.ch4.No7;

/*
원색의 조합 여덜개(BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE)를 나타내고 getRed, getGreen, getBlue 메서드를
포함하는 열거 타입을 정의하라.
 */

public class Main {
    enum Color {
        BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;

        public Color getRed() {
            return RED;
        }
        public Color getGreen() {
            return GREEN;
        }
        public Color getBlue() {
            return BLUE;
        }


    }
    public static void main(String[] args) {
        System.out.println(Color.BLACK.getBlue());
    }
}
