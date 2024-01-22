package ref;

public class NullPointerException2 {
    public static void main(String[] args) {

        BigData bigData = new BigData(); //x001
        System.out.println(bigData.count);
        System.out.println(bigData.data);

        //nullpointerexception
        System.out.println(bigData.data.value);//x001.null.value 참조할곳이 없어서 nullpointerexception 발생
    }
}
