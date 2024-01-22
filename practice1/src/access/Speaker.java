package access;

public class Speaker {

    //private: 외부 호출을 막음(접근제어자)
    private int volume;

    //생성자를 만들어 초기음량 지정하도록함
    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if (volume >= 100){
            System.out.println("최대 볼륨");
        }
        else {
            volume+=10;
            System.out.println("음량 증가");
        }
    }
    void volumeDown(){
        volume-=10;
    }

    void showVolume(){
        System.out.println("현재 음량"+volume);
    }
}
