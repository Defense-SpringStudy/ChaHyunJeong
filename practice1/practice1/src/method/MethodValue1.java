package method;

public class MethodValue1 {

    public static void main(String[] args) {

        int num1 = 5;
        System.out.println(num1);
        changeNumber(num1); // num2=10
        System.out.println(num1); //10이 아닌 5가 출력됨 num1 =5이기 때문
    }

    public static void changeNumber(int num2){

        System.out.println(num2);
        num2 = num2 * 2;
        System.out.println(num2);
    }
}
