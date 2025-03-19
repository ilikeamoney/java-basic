package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("결제 수단 입력하세요. (exit 종료)");
            String payOp = scanner.nextLine();

            if (payOp.equals("exit")) {
                break;
            }

            System.out.println("결제 금액 입력하세요");
            int amount1 = scanner.nextInt();
            scanner.nextLine();
            payService.processPay(payOp, amount1);
        }
    }
}
