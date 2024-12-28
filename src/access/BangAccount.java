package access;

public class BangAccount {

    private int balance;

    public BangAccount() {
        this.balance = 0;
    }

    // public 메서드 deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않거나 잔고가 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }

}
