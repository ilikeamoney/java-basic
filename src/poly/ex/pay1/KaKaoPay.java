package poly.ex.pay1;

public class KaKaoPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결");
        System.out.println(amount + "원 결제 시도");
        return true;
    }
}
