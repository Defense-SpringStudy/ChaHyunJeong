package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {

        //객체를 생성->초기화를 메서드로 해서 반복되는 코드 줄임
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 90, 18);

        MemberInit member2 = new MemberInit();
        initMember(member1, "user1", 90, 18);


        MemberInit[] members = {member1, member2};

        for(MemberInit s: members){
            System.out.println(s.age + s.grade+ s.name);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
