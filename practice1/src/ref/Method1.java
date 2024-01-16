package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); //x001참조값
        initStudent(student1, "1", 10, 90);

        Student student2 = new Student(); //x002참조값
        initStudent(student2,"2", 11, 100);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.age = age;
        student.name = name;
        student.grade = grade;
    }

    public static void printStudent(Student student){
        System.out.println("이름:"+student.name+"나이"+student.age);

    }
}
