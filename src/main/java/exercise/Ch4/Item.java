package exercise.Ch4;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        //두 객체가 동일한지 알아보는 빠른 검사. 참조가 같은지 검사.
        if (this == obj) return true;

        //매개변수가 null이면 false를 반환해야 한다.
        if(obj == null) return false;
        //otherObject가 Item의 인스턴스인지 검사한다.
        if(!(obj instanceof Item)) return false;
        // 인스턴스 변수들의 값이 동일한지 검사한다.
        Item other = (Item) obj;
        Double a = other.price;
        Double b = price;

        return Objects.equals(description, ((Item) obj).description)
                && a.equals(b);
    }
//    @Override
//    public boolean equals(Object obj) {
//        //두 객체가 동일한지 알아보는 빠른 검사. 참조가 같은지 검사.
//        if (this == obj) return true;
//
//        //매개변수가 null이면 false를 반환해야 한다.
//        if(obj == null) return false;
//        //otherObject가 Item의 인스턴스인지 검사한다.
//        if(getClass() != obj.getClass()) return false;
//        System.out.println("뭐시여 이게"+obj.getClass().getName());
//        System.out.println("뭐시여 이게"+getClass().getName());
//        // 인스턴스 변수들의 값이 동일한지 검사한다.
//        Item other = (Item) obj;
//        Double a = other.price;
//        Double b = price;
//
//        return Objects.equals(description, ((Item) obj).description)
//                && a.equals(b);
//    }

}
