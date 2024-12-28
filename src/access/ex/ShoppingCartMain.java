package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10);
        String[] itemName = {"사과", "당근", "포도", "수박", "파인애플", "딸기", "복숭아", "참외", "멜론", "자두"};
        for (int i = 0; i < 10; i++) {
            Item item = new Item(itemName[i], 1000, 10);
            cart.addItem(item);
        }

        // 초과 삽입
        Item item = new Item("구아바", 5000, 30);
        cart.addItem(item);

        // 아이템 출력
        cart.printItems();

        // 합계 출력
        cart.getTotalPrice();

        for (int i = 0; i < 10; i++) {
            cart.removeItem();
        }

        // 초과 삭제
        cart.removeItem();
    }
}
