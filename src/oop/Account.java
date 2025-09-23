package oop;

public class Account {
    int balance;


    void deposite(int amount){
        balance+=amount;
    }
    void withdrow(int amount){
        if(balance<amount){
            System.out.println("잔액이 부족합니다");
        }else {
            balance-=amount;
        }
    }

}
