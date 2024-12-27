package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] pos = new ProductOrder[3];
        ProductOrder po1 = createOrder("두부", 1000, 5);
        ProductOrder po2 = createOrder("김치", 5000, 10);
        ProductOrder po3 = createOrder("라면", 1400, 3);
        int total = 0;

        pos[0] = po1;
        pos[1] = po2;
        pos[2] = po3;

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
