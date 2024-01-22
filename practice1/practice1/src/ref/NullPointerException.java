package ref;

import ref.Data;

public class NullPointerException {

    //널을 가르키는 예외
    //지역변수가 널을 가르킬때
    //객체를 참조할때. 널을 참조할때 참조값이 없기 땨문에 예외 발생
    //nullpointerexception = null에 .을 찍었다고 생각하면됨
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;
        System.out.println(data.value);
    }
}
