package extends1.access.parent;

public class parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;

    public void publicMethod(){
        System.out.println("parent.protextedmethod");
    }

    void defaultMethod(){
        System.out.println("parent.defaultmethod");
    }

    protected void protectedMethod(){
        System.out.println("parent.protectedmethod");
    }
}
