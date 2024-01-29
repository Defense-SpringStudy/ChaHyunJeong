package static1;

public class StaticMain1 {

    public static void main(String[] args) {
        Static1 static1 = new Static1("A");
        System.out.println(static1.count);
        Static1 static2 = new Static1("B");
        System.out.println(static2.count);
        Static1 static3 = new Static1("C");
        System.out.println(static3.count);

    }
}
