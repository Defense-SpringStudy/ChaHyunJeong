package method;

public class MethodCasting {

    public static void main(String[] args) {
        double number = 1.5;

        //명시적 형변환을 사용해 정수형으로 형변환
        printNumber((int)number);
    }

    public static void printNumber(int n){
        System.out.println(n);
    }
}
