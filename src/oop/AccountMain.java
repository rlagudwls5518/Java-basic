package oop;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposite(10000);
        account.withdrow(9000);
        account.withdrow(2000);

        System.out.println("잔고 : "+account.balance);
    }
}
