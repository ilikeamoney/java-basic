package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가 합니다.");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("음량을 줄일 수 없습니다. 최소 음량");
        }

        volume -= 10;
    }


    void currentVolume() {
        System.out.println("현재 음량 = " + volume);
    }
}
