package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 10;
        System.out.println("메서드 호출 전"+data1.value);

        //datax가 data1의 참조값을 복사하는 것 따라서
        //참조값이 가르키는 값이 바뀌면 그 참조값을 가지는 변수의 값도 바뀜
        changeReference(data1);
        System.out.println("메서드 호출 후"+data1.value);
    }

    public static void changeReference(Data datax){
        datax.value = 20;
    }
}
