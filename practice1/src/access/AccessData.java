package access;

public class AccessData {

    public int publicField;
    int defaultFiled;
    private int privateField;

    public void publicMethod() {
        System.out.println(publicField);
    }

    void defaultMethod(){
        System.out.println(defaultFiled);
    }

    private void privateMethod(){
        System.out.println(privateField);
    }

    //내부에서 접근할때는 모두 다 접근가능 프라이빗까지!
    public void innerAccess(){
        privateField = 100;
        publicField = 100;
        defaultFiled = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
