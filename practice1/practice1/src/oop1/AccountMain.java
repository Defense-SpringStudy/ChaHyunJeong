package oop1;

public class AccountMain {

    public static void main(String[] args) {

        AccountData accountData = new AccountData();

        accountData.amount = 10000;
        accountData.deposit();
        accountData.amount = 9000;
        accountData.withdraw();
        accountData.amount=2000;
        accountData.withdraw();
        System.out.println(accountData.balance);

    }
}
