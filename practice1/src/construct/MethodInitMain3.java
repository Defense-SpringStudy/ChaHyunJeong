package construct;

public class MethodInitMain3 {

    public static void main(String[] args) {

        //객체를 생성->초기화를 메서드로 해서 반복되는 코드 줄임
        MemberInit member1 = new MemberInit();

        //initMember : member의 초기값을 설정해주는 메서드
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 18, 100);


        MemberInit[] members = {member1, member2};

        for(MemberInit s: members){
            System.out.println(s.age + s.grade+ s.name);
        }
    }


}
