package poly.ex.pay1;

public class DefaultPay implements Pay {

    /**
     * 이렇게 null 인 상황에서 객체를 샤용해
     * 특수한 처리를 사용할 수 있다.
     **/

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
