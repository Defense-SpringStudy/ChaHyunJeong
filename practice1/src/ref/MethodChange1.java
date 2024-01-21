package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출전"+a);

        //변수는 항상 값을 복사해서 전달
        //따라서 매개변수 x에 a의 값 전달 int x = a이므로 x는 10을 가짐
        //메서드 안에서 x=20으로 변경 but a의 값은 10으로 유지
        changePrimitive(a);

        //오... 20이 나올줄??????????????
        System.out.println("메서드 호출 후"+a);
    }

    public static void changePrimitive(int x){
        x = 20;
    }
}
