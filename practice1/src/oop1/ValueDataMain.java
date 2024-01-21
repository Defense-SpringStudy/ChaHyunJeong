package oop1;

public class ValueDataMain {

    //데이터와 메서드 분리되어 있음
    public static void main(String[] args) {

        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
    }

    static void add(ValueData valueData){
        valueData.value++;
    }

}
