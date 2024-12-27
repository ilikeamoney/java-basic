package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주문의 갯수를 입력하세요 = ");
        int quantity = sc.nextInt();
        sc.nextLine();
        int total = 0;
        ProductOrder[] pos = new ProductOrder[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println(i + "번째 주문을 입력 받습니다.");

            System.out.print("상품명 = ");
            String productName = sc.nextLine();
            System.out.print("가격 = ");
            int price = sc.nextInt();
            System.out.print("수량 = ");
            int stock = sc.nextInt();
            sc.nextLine();

            ProductOrder po = createOrder(productName, price, stock);

            pos[i] = po;
        }

        printOrders(pos);
        total = getTotal(pos);

        System.out.println("총 결제 금액 = " + total);
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;
        return po;
    }

    public static void printOrders(ProductOrder[] pos) {
        for (ProductOrder po : pos) {
            System.out.println("상품명 = " + po.productName + " 가격 = " + po.price + " 수량 = " + po.quantity);
        }
    }

    public static int getTotal(ProductOrder[] orders) {
        int total = 0;

        for (ProductOrder od : orders) {
            total += od.price * od.quantity;
        }

        return total;
    }
}
