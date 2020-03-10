package exercise.Ch3;

public interface Identified {
    default int getId() { return Math.abs(hashCode());}
    default String test() { return "인터페이스의 기본 메서드";}
//    int getId();
}
