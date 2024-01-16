package ref;

public class VarChange2 {

    public static void main(String[] args) {

        //클래스 객체 생성 : 참조형 변수 = 참조값을 가지고 있음
        Data data1 = new Data();
        data1.value = 10;

        //data1의 참조값을 복사해서 data2에 넣어줌
        //??data1이 가르키는 인스턴스를 복사하는 것이 아닌 변수에 들어있는 참조값만 복사
        Data data2 = data1;

        System.out.println("1의 참조값"+data1);
        System.out.println("2의 참조값"+data2);
        System.out.println(data1.value);
        System.out.println(data2.value);

        //data1변경 : data1과 data2의 참조값이 같은 = 같은 것을 가리키고 있음
        //따라서 data1의 속성을 변경 -> data2의 속성또한 바뀜
        data1.value = 20;
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data1.value);
        System.out.println(data2.value);

        //data2변경 : 참조값이 가리키는 값이 바뀐거
        //data1 또한 바뀜
        data2.value=30;
        System.out.println(data1.value);
        System.out.println(data2.value);
    }
}
