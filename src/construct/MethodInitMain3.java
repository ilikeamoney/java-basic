package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit[] ms = new MemberInit[2];

        MemberInit m1 = new MemberInit();
        m1.initMember("user1", 20, 60);

        MemberInit m2 = new MemberInit();
        m2.initMember("user1", 20, 60);

        ms[0] = m1;
        ms[1] = m2;

        for (MemberInit m : ms) {
            System.out.println("이름 = " + m.name + " 나이 = " + m.age + " 성적 = " + m.grade);
        }
    }
}
