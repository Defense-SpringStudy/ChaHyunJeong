package method;

public class Overloading1 {

    public static void main(String[] args) {

        int a = 10, b =20;
        int sum1, sum2;

        sum1 = add(a, b);
        System.out.println(sum1);
        sum2 = add1(a, b);
        System.out.println(sum2);
    }

    //메서드 오버로딩 : 메서드 시그니처(메서드 이름, 매개변수 타입)이 같은 경우 발생

    public static int add(int a, int b){
        System.out.println("1번 호충");
        return a+b;
    }

    public static int add1(int a, int b){
        System.out.println("1번 호충");
        return a+b;
    }
}
