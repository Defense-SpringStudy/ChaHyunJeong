package method;

public class Method1 {

    //같은 코드를 반복해서 수행할때
    public static void main(String[] args) {

        //add 메서드 호출
        //메서드에 넘기는 값과 파라미터의 타입이 같아야함
        //5, 10 = 인수/인자
        int sum1 = add(5, 10);

        System.out.println(sum1);
    }

    //메서드 선언(이름, 반환 타입, 매개변수)
    //public:다른 클래스에서 호출할 수 있는 메서드
    //매개변수 = int a, int b
    public static int add(int a, int b){

        //메서드 본문
        int sum = a + b;

        //반환 값 꼭 쓰기(int반환)
        return sum;
    }
}

//인수, 인자 vs 매개변수