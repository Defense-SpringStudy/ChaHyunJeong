package construct;

public class ConstructMain1 {
    public static void main(String[] args) {

        //객체를 생성하는 동시에 생성자를 불러
        //생성자는 인스턴스 생성하고 나서 즉시 호출됨
        //생성자는 직접 정의한 생성자를 반드시 호출해야함(안그럼 컴파일 오류 발생)
        MemberConstruct member1 = new MemberConstruct("user1", 15, 100);
        MemberConstruct member2 = new MemberConstruct("user2", 15, 100);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members){
            System.out.println(s.name + s.age + s.grade);
        }
    }
}
