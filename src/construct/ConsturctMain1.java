package construct;

public class ConsturctMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 18, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = new MemberConstruct[2];

        members[0] = member1;
        members[1] = member2;

        for (MemberConstruct member : members) {
            System.out.println("이름 = " + member.name + " 나이 = " + member.age + " 성적 = " + member.grade);
        }
    }
}
