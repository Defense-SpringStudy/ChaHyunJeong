package ref;

import ref.Data;

public class NullMain {

    public static void main(String[] args) {
        Data data = null; //data에 아무것도 없음
        System.out.println(data);
        // data에 참조값이 들어감
        //data에 참조할 객체 생김
        data = new Data();
        System.out.println(data);

        //다시 널을 넣어서 data 인스턴스 더는 참조x
        //따라서 이 인스턴스에 접근할 방법이 업슴
        //메모리 용량만 차지할뿐임
        //가비지 컬렉션 : 자바는 이런 인스턴스를 자동으로 메모리에서 제거해줌
        data = null;
        System.out.println(data);
    }
}
