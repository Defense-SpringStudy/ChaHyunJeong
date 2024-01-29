package extends1.problem1;

public class Item  {
    String name;
    int price;

    public Item(String name, int price){
        this.price = price;
        this.name = name;
    }

    public void print(){
        System.out.println("이름: "+name+"가격 :"+price);
    }
}
