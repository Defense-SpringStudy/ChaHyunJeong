package static1;



public class Static2 {
    public String name;

    public Static2(String name, Counter counter){
        this.name = name;
        counter.count++;
    }
}
