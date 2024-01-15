package class1;

public class Class4 {

    //배열을 사용하면 하나의 데이터 구조로 묶어 사용가능


        public static void main(String[] args) {


            Student student1;

            student1 = new Student();

            //인스턴스의 변수에 접근할때
            student1.name = "학생1";
            student1.age = 15;
            student1.grade = 90;


            Student student2 = new Student();
            student2.name = "학생2";
            student2.age = 18;
            student2.grade = 80;

            //배열 생성하고 크기도 설정해주기
            //students에도 배열의 참조값이 들어가있ㅁ음
           Student[] students = new Student[2];
           students[0] = student1;
           students[1] = student2;

            System.out.println(students[0].name+students[0].grade);
            System.out.println(students[1].name+students[1].grade);
        }
    }


