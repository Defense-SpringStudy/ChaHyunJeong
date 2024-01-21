package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {

        //객체를 생성->초기화
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();

        member2.name = "user1";
        member2.age = 15;
        member2.grade = 90;

        MemberInit[] members = {member1, member2};

        for(MemberInit s: members){
            System.out.println(s.age + s.grade+ s.name);
        }
    }
}
