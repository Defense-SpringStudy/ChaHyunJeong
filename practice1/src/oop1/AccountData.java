package oop1;

public class AccountData {

    int balance;
    int amount;

    void deposit(){
        balance = balance + amount;
    }

    void withdraw(){
        if (balance < amount){
            System.out.println("잔액 부족");
        }
        else {
            balance = balance - amount;
        }
    }


}
