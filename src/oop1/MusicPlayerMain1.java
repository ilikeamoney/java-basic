package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 = " + volume);

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 = " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 = " + volume);

        if (isOn) {
            System.out.println("음악 볼륨 = " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        isOn = false;
        System.out.println("플레이어 종료합니다");
    }
}
