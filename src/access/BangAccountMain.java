package access;

public class BangAccountMain {
    /*
    캡슐화는 내가 정의한 클래스 기능외에
    그 기능을 도와주는 나머지 기능들은 모두 숨겨서 처리한다.
    즉 핵심 기능만 외부에서 오픈하고 나머지는 전부 숨긴다.
     */

    public static void main(String[] args) {
        BangAccount account = new BangAccount();

        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
