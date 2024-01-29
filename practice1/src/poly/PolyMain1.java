package poly;

public class PolyMain1 {

    public static void main(String[] args) {

        //부모변수가 자식 참조
        Parent parent = new Child();

        //부모가 자식 참조
        parent.parentMethod();

        //자식변수는 부모 참조 불가
        //Child child = new Parent();

        //child.childMethod();


    }
}
