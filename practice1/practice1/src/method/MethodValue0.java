package method;

public class MethodValue0 {

    public static void main(String[] args) {


        int num1= 5;

        //매우 중요 : 변수의 값을 복사해서 대입함
        //num1의 값을 복사해서 num2에 대입함
        int num2 = num1;

        num2 = 10;

        System.out.println(num1);
        System.out.println(num2);
    }
}
