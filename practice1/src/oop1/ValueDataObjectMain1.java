package oop1;

public class ValueDataObjectMain1 {

    //데이터와 메서드 분리되어 있음
    public static void main(String[] args) {

        ValueData valueData = new ValueData();

        //ValueData클래스에는 value라는 멤버변수 뿐만아니라 add()메서드도 함께 존재
        //메서드 호출하면 메서드 내부에서 value++호출 x002.add()
        //이때 본인 인스턴스에 있는 멤버 변수 접근해서 value증가 x002.value
        //따라서 객체는 자신의 메서드를 통해 자신의 멤버변수에 접근할수 있음!!!을 알수있당
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println(valueData.value);
    }



}
