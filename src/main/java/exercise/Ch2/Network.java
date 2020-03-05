package exercise.Ch2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Network {
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }

        // 내부 클래스의 메서드는 외부 클래스(outer class)의 인스턴스 변수에 접근할 수 있다. members는 외부에 선언된 변수다. 이것이 내부 클래스를 정적 중첩 클래스와 구별시키는 요인인데, 내부 클래스의 각 객체는 외부 클래스의 객체에 대한 참조를 포함한다.
        public void deactivate() {
            System.out.println(this);
            members.remove(this);
        }

        //외부 클래스의 인스턴스를 거쳐 외부클래스의 메서드를 호출하여 계정 삭제중.
        public void deactivateWithInnerclass() {
            unenroll(this);
        }
    }
    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        Member newMember = this.new Member(name);
        members.add(newMember);

        return newMember;
    }

    public void unenroll(Member m) {
        members.remove(m);
    }

    public static void main(String[] args) {
        Network myFace = new Network();
        Network.Member fred = myFace.enroll("fred");
        for(Member member : myFace.members) {
            System.out.println(member.name);
        }
        System.out.println();
//        fred.deactivate();
        fred.deactivateWithInnerclass();
        for(Member member : myFace.members) {
            System.out.println(member.name);
        }

        Network.Member wilma = myFace.new Member("Wilma");

        System.out.print(wilma.name);
    }
}
