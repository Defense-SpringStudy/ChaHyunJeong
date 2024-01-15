package class1;

public class Class1 {

    public static void main(String[] args) {

        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("학생1"+student1Name+"나이"+student1Age+"성적"+student1Grade);
        System.out.println("학생2"+student2Name+"나이"+student2Age+"성적"+student2Grade);

        //배열을 사용해서 이 문제를 풀어보자
        //세개의 배열에 데이터가 나눠져있기 때문에 데이터를 수정할때 주의해야한다
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAge = {15, 16};
        int[] studentGrade={90, 80};
        for (int i = 0; i< studentNames.length; i++){
            System.out.println(studentNames[i]+studentAge[i]+studentGrade[i]);
        }
    }



}
