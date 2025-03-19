package poly.ex.pay0;

public class NaverPay implements Pay{
    private final String option;
    private final int amount;

    @Override
    public boolean pay() {
        System.out.println(this.option + "페이 시스템과 연결합니다.");
        System.out.println(this.amount + "원 결제를 시도합니다.");
        return true;
    }

    public NaverPay(String option, int amount) {
        this.option = option;
        this.amount = amount;
    }

    public String getOption() {
        return option;
    }

    public int getAmount() {
        return amount;
    }
}
