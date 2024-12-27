package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        MemberInit[] ms = new MemberInit[2];

        m1.name = "user1";
        m1.age = 10;
        m1.grade = 60;

        MemberInit m2 = new MemberInit();

        m2.name = "user1";
        m2.age = 10;
        m2.grade = 60;

        ms[0] = m1;
        ms[1] = m2;

        for (MemberInit m : ms) {
            System.out.println("이름 = " + m.name + " 나이 = " + m.age + " 성적 = " + m.grade);
        }
    }
}
