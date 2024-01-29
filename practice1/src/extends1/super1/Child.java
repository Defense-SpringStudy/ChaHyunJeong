package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("child.hello");
    }

    public void call(){

        //내 타입에서부터 찾는거 this
        System.out.println(this.value);

        //부모 타입에서부터 찾는거 super
        System.out.println(super.value);
    }
}
