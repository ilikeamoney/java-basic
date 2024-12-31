package final1;

public class ConstantMain2 {
    /*
    상수는 프로그램 내에서 변하지 않는 수를 명확하게 사용할 수 있다.
     */

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 999;

        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 = " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록");
            return;
        }

        System.out.println("게임에 참여합니다.");

    }
}
