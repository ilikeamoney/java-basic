package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay;
        if (option.equals("kakao")) {
             pay = new KaKaoPay(option, amount);
        } else if (option.equals("naver")) {
            pay = new NaverPay(option, amount);
        } else {
            pay = null;
            System.out.println("결제 수단이 없습니다.");
        }

        if (pay != null) {
            result = pay.pay();
        }

        if (result) {
            System.out.println("결제 완료");
        } else {
            System.out.println("결제 실패");
        }
    }
}
