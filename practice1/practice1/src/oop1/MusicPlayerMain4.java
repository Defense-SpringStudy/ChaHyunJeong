package oop1;

public class MusicPlayerMain4 {

    //객체지향 프로그램
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        //속성과 기능이 하나로 묶여 필요한 기능을 메서드를 통해 외부에 지급
        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.off();
    }
}
