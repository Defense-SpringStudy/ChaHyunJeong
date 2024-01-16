package ref;

public class Method2 {


    public static void main(String[] args) {

        //지역변수 = 메서드에 선언, 매개변수도 지역 변수의 한 종류
        //지역변수는 수동 초기화 무조건 초기화시켜줘야함 안그러면 오류남
        Student student1 = createStudent("1", 10, 100);
        Student student2 = createStudent("2", 11, 90);

        printStudent(student1);
        printStudent(student2);
    }

    //객체 생성과 초기값 설정하는 메서드
    //메서드 내부에서 인스턴스 생성한 후 참조값을 메서드 외부로 반환
    //반환값은 Student(참조형)
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }


    public static void printStudent(Student student){
        System.out.println("이름:"+student.name+"나이"+student.age);

    }
}
