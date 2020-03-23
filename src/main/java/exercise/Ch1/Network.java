package exercise.Ch1;

import java.util.ArrayList;

public class Network {
    ArrayList<Member> members = new ArrayList<>();
    public class Member {
        public void deactivate(){
            unenroll(this);
        }
    }
    public Member enroll(String name) {
        Member member = new Member();
        members.add(member);
        return member;
    }
    public void unenroll(Member member){
        members.remove(member);
    }
}
