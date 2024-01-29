package access;

import java.util.Scanner;

public class MaxCounter {

    int count;
    int max;

    MaxCounter(int max){
        this.max = max;
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("최대값을 입력하세요");
        this.max = scanner.nextInt();*/
    }
    public void increment() {
        if (count < max) {
            count += 1;
        } else {
            System.out.println("최대값을 초과할 수 없습니다");
        }
    }

    public int getCount(){
        return count;
    }
}
