package exerciseproblem.ch3.No7;

import java.util.Iterator;

/* 이제 인터페이스에 메서드를 추가하면 무슨 일이 일어나는지 시험해보자. 자바 7로 IntSequence가 아니라 Iterator<Integer>를 구현하는
DigitSequence를 구현하라. hasNext, next, 아무일도 하지 않는 remove를 구현해야한다. 그다음 인스턴스의 요소들을 출력하는 프로그램을
작성한다. 자바 8의 Iterator 클래스에는 또 다른 forEachRemaining 메서드가 추가 되었다. 자바 8로 전환해도 작성한 코드가 여전히 컴파일
되는가?  forEachRemaining 메서드를 호출하면 어떻게 되는가? 자바 8에서는 remove 메서드가 UnsupportedOperationException을
던지는 기본 메서드가 되었다. 작성한 클래스의 인스턴스에 remove를 호출하면 어떻게 되는가?
 */
public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(4);

        Iterator iter = sequence.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
