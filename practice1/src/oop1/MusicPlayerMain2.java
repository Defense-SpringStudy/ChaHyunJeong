package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {

        //절차지향2_데이터 묶어서 더 편리하게!
        //절차지향3_메서드로 중복된 부분 묶어서(모듈화)
        //절차지향프로그래밍에서는 데이터와 메서드가 따로 잇어서 하나를 수정하면 다른 하나도 수정ㅎ해야하는 번거로움 잇음
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);

        volumeUp(data);

        volumeDown(data);

        statusMusicPlayer(data);

        off(data);

    }

    //중복되는 부분은 메서드로~
    //뮤직플레이어 키는 메서드

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("시작");
    }

    //뮤직플레이어 off
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("종료");
    }

    //뮤직플레이어 볼륨증가
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println(data.volume);
    }

    //뮤직플레이어 볼륨 다운
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println(data.volume);
    }

    //뮤직플레이어 상태확인 메서드
    static void statusMusicPlayer(MusicPlayerData data){
        if (data.isOn){
            System.out.println("작동중 : "+data.volume);
        }
        else {
            System.out.println("꺼짐 : "+data.volume);
        }
    }
}
