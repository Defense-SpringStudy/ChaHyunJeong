package construct;

public class ConstructOverloadingMain {

    public static void main(String[] args) {


        //생성자는 하나만 호출됨
        MemberConstructOverloading member1 = new MemberConstructOverloading("user1", 15);
        MemberConstructOverloading member2 = new MemberConstructOverloading("user2", 15, 100);

        MemberConstructOverloading[] members = {member1, member2};

        for (MemberConstructOverloading s : members) {
            System.out.println(s.name + s.age + s.grade);
        }
    }
}
