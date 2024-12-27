package construct;

public class ConsturctMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 18, 90);

        // 생성자 오버로딩 사용 부분
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = new MemberConstruct[2];

        members[0] = member1;
        members[1] = member2;

        for (MemberConstruct member : members) {
            System.out.println("이름 = " + member.name + " 나이 = " + member.age + " 성적 = " + member.grade);
        }
    }
}
