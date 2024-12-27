package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        checkStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    private static void checkStatus(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("음악 볼륨 = " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    private static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("플레이어 종료합니다");
    }


    private static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    private static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 = " + data.volume);
    }

    private static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 = " + data.volume);
    }
}
