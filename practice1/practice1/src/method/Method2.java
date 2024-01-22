package method;

public class Method2 {

    public static void main(String[] args) {

        printHeader();

        //반환값이 있다고 무조건 반환값을 받아야하는건 아님 반환값을 궅이 받지 않아도 됨
    }

    //매개변수 없고 반환타입 없을때
    //반환타입 = void
    //매개변수 = ()
    //모든 메서드는 return 추가 but void인경우에는 return 생략가능
    //리턴을 만나면 메서드를 바로 빠져나감 밑에 코드들 실행 안함
    public static void printHeader(){
        System.out.println("프로그램 시작");
        return;
    }
}
