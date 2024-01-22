package casting;

public class Casting1 {

    public static void main(String[] args) {

        //작은거 -> 큰거에 담을때 는 자동형변환 궅이 개발자가 안바꿔줘도 된다잉
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println(longValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        doubleValue = 20L;
        System.out.println(doubleValue);
    }
}
