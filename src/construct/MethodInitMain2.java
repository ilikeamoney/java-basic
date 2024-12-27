package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit[] ms = new MemberInit[2];

        MemberInit m1 = new MemberInit();
        initMember(m1, "user1", 20, 60);

        MemberInit m2 = new MemberInit();
        initMember(m2, "user1", 20, 60);

        ms[0] = m1;
        ms[1] = m2;

        for (MemberInit m : ms) {
            System.out.println("이름 = " + m.name + " 나이 = " + m.age + " 성적 = " + m.grade);
        }
    }

    static void initMember(MemberInit m, String name, int age, int grade) {
        m.name = name;
        m.age = age;
        m.grade = grade;
    }
}
