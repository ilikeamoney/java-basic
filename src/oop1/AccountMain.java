package oop1;

/**
 * 객체지향프로그래밍이란
 *
 * 현실 세계의 사물을 속성과 기능으로 추출하여
 * 분석하고 클래스로 설계하여 사용하는 프로그래밍 기법이다.
 */

public class AccountMain {
    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(10000);
        a.withdraw(5000);
        a.withdraw(7000);

        System.out.println("현재 잔액 = " + a.balance);


    }
}
