package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker sp = new Speaker(90);
        sp.currentVolume();

        sp.volumeUp();
        sp.currentVolume();

        sp.volumeUp();
        sp.currentVolume();

        /* 필드에 직접 접근
        외부에서 클래스 멤버변수에 직접적으로 접근하는 문제를
        예방하지 않으면 예기지 못한 프로그램 문제가 발생할 수 있다.
         */

        System.out.println("volume 필드 직접 접근 수정");
//        sp.volume = 200;
        sp.currentVolume();
    }
}
