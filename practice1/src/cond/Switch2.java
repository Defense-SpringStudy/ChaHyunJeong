package cond;

public class Switch2 {

    public static void main(String[] args) {

        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 1;
            case 3:
                coupon = 500;
                break;
            default:
                coupon = 100;
        }
        System.out.println("발급" + coupon);
    }
}
