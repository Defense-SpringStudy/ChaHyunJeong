package static1;

public class StaticMain3 {

    public static void main(String[] args) {
        Static3 data1 = new Static3("A");
        System.out.println(Static3.count);
        Static3 data2 = new Static3("B");
        System.out.println(Static3.count);

        Static3 data3 = new Static3("C");
        System.out.println(Static3.count);

    }
}
