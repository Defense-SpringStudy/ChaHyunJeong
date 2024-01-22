package cond;

public class SwitchProblem1 {

    public static void main(String[] args) {

        String grade = "A";

        switch (grade){
            case "A":
                System.out.println("좋은 성과");
                break;
            case "B":
                System.out.println("탁월");
                break;
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된 학점");
                break;
        }

    }

}
