package static1;

public class StaticMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Static2 data1 = new Static2("A", counter);
        System.out.println("A count=" + counter.count);
        Static2 data2 = new Static2("B", counter);
        System.out.println("B count=" + counter.count);
        Static2 data3 = new Static2("C", counter);
        System.out.println("C count=" + counter.count);
    }
}
