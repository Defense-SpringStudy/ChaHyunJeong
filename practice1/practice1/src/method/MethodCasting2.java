package method;

public class MethodCasting2 {

    public static void main(String[] args) {

        int number = 100;

        //큰거에서 작은거는 아무문제없이 자동형변환됨
        inputNumber(number);
    }

    public static void inputNumber(double num){

        System.out.println(num);
    }
}
