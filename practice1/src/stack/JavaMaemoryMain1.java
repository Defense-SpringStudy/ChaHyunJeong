package stack;

public class JavaMaemoryMain1 {

     public static void main(String[] args) {
        System.out.println("start");
        method1(10);
        System.out.println("end");
    }

    static void method1(int m1){
        System.out.println("method1");
        int cal = m1*2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2){
        System.out.println("method2");
        System.out.println("method2 end");

    }
}
