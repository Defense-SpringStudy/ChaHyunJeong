package class1;

public class Class3 {

    public static void main(String[] args) {


        //Student 클래스는 그저 설계도 -> 설계도 기반으로 만든 실체를 객체 or 인스턴스라함
        //Student 타입을 받을 수 있는 변수 선언(ex int num)
        Student student1;

        //student1은 객체 or 인스턴스
        //객체 만들기 = 메모리 확보하기
        //Student 클래스 정보를 기반으로 새로운 객체를 생성해라
        //객체가 생성되면 참조값 반환 student1에 참조값 보관하고이씀 = student1을 통해 메모리에 있는 실제 객체 전븍하고 사용가능
        student1 = new Student();

        //인스턴스의 변수에 접근할때
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;


        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        System.out.println(student1.name+student1.grade+student1.age);
        System.out.println(student2.name+student2.grade+student2.age);

    }
}
