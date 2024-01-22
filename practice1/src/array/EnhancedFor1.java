package array;

public class EnhancedFor1 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        //향상된 for문 for-each문
        //배열을 처음부터 끝까지 돌릴때 인덱스 넣어주지 않아도/종료조건을 주지 않아도 ㄱㅊ
        //단축키 : iter
        //향상된 for문 사용x : 증가하는 인덱스 값이 필요할때
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
