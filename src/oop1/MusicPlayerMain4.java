package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        // 음악 플레이어 켜기
        mp.on();

        // 볼륨 업
        mp.volumeUp();

        mp.volumeUp();

        // 볼륨 다운
        mp.volumeDown();

        // 현재 상태 출력
        mp.checkStatus();

        // 음악 플레이어 끄기
        mp.off();
    }
}
