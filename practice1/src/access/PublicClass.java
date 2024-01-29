package access;

public class PublicClass {

    //퍼블릭이기때문에 어디서든 이용가능
    public static void main(String[] args) {

        //같은 패키지이기때문에 이용가능
        PublicClass publicClass = new PublicClass();
        DefaultClass1 Class1 = new DefaultClass1();
        DefaultClass2 Class2 = new DefaultClass2();
    }
}

//같은 패키지
class DefaultClass1{

}

class DefaultClass2{

}
