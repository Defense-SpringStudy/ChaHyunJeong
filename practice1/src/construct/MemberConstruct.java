package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    //생설자 : 클래스와 이름이 같아야함
    //반환타입 업슴
    MemberConstruct(String name, int age, int grade){
        System.out.println(name + age + grade);

        this.age = age;
        this.name = name;
        this.grade = grade;
    }

}
