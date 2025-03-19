package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao
        String payOpKaKao = "kakao";
        int amount1 = 5000;
        payService.processPay(payOpKaKao, amount1);

        // naver
        String payOpNaver = "naver";
        int amount2 = 10000;
        payService.processPay(payOpNaver, amount2);

        // 잘못된 결제 수단
        String payOpBad = "bad";
        int amount3 = 2000;
        payService.processPay(payOpBad, amount3);

    }
}
