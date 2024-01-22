package access;

public class SpeakerMain {
    public static void main(String[] args) {

        //생성자 : 초기음량90으로 설정
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //volume 필드에 직접 접근
        System.out.println("volume 직접 접근");

        //private으로 직접 접근 막아놓았기 때문에 오류남 -> 접근제어자를 통해 데이터 통제!
        //speaker.volume = 200;
        speaker.showVolume();
    }
}
