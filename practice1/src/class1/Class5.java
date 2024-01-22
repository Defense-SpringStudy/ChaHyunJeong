package class1;

public class Class5 {

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

           for (int i = 0; i<students.length;i++){
               System.out.println(students[i].name+students[i].grade);
           }

           //반복문 더 최적하하면
            for (int i = 0; i<students.length;i++){
                Student s = students[i];
                System.out.println(s.name+s.grade);
            }

            //향상된 for문으로 쓰면(단축키 iter)
            for (Student s : students){
                System.out.println(s.name+s.grade);
            }

        }
    }


