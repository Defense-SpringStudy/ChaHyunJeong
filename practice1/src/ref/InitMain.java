package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value: "+data.value1);//데이터클래스에서 초기화 안해줬기 떄문에 0 출력
        System.out.println("value: "+data.value2); // 데이터클래스에서 10으로 초기화해줬기 때문에 10출력
    }
}
