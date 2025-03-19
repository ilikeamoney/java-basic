package poly.ex.pay1;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KaKaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        }

        // 이렇게 객체를 통해 null 상황을 대체 할 수 있음
        return new DefaultPay();
    }
}
