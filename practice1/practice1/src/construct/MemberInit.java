package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

     void initMember (String name, int age, int grade){

         //this : 자기자신의 인스턴스를 가르킴
         //즉 this = 인스턴스의 참조값 의미
         //멤버변수에 접근할때 사용
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

