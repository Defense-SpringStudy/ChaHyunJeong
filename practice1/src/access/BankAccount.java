package access;

public class BankAccount {

    private int balance;

    public BankAccount(){
        balance = 0;
    }

    //퍼블릭 메서드
    public void deposit(int amount){
        balance+=amount;
    }


    public void withdraw(int amount){
        if (isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        }else {
            System.out.println("유효x");
        }
    }


    public int getBalance(){
        return balance;
    }

    //이 기능은 퍼블릭으로 다른 클래스에서 호출 허용x
    private boolean isAmountValid(int amount){

        //금액이 0보다 커야함
        return amount > 0;
    }
}
