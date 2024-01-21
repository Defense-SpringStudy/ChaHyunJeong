package oop1;

//음악 플레이어에 필요한 데이터와 기능(메서드) 모두 저장된 객체지향 프로그램
public class MusicPlayer {

    int volume;
    boolean isOn;

    //매개변수 x : 자기 내부에서 데이터 받기때문에 외부에서 받아올 필요업슴
    //static x
    void on(){
        isOn = true;
        System.out.println("시작");
    }

    //뮤직플레이어 off
    void off(){
        isOn = false;
        System.out.println("종료");
    }

    //뮤직플레이어 볼륨증가
    void volumeUp(){
        volume++;
        System.out.println(volume);
    }

    //뮤직플레이어 볼륨 다운
    void volumeDown(){
        volume--;
        System.out.println(volume);
    }

    //뮤직플레이어 상태확인 메서드
    void statusMusicPlayer(){
        if (isOn){
            System.out.println("작동중 : "+volume);
        }
        else {
            System.out.println("꺼짐 : "+volume);
        }
    }
}
