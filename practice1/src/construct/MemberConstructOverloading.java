package construct;

public class MemberConstructOverloading {

    String name;
    int age;
    int grade;

    //생성자 오버로딩
    MemberConstructOverloading(String name, int age){
        this(name, age, 90); //this() : 생성자 내부에서 자신의 생성자 호출 가능
    }

    //생설자 : 클래스와 이름이 같아야함
    //반환타입 업슴
    MemberConstructOverloading(String name, int age, int grade){
        System.out.println(name + age + grade);

        this.age = age;
        this.name = name;
        this.grade = grade;
    }

}
