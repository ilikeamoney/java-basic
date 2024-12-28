package access.ex;

public class ShoppingCart {
    private Item[] items;
    private int itemCount;
    private int index = 0;

    private ShoppingCart() {};

    public ShoppingCart(int itemCount) {
        this.itemCount = itemCount;
        items = new Item[itemCount];
    }

    public void addItem(Item item) {
        if (!checkMore()) {
            items[index++] = item;
            return;
        }

        System.out.println("더 이상 아이템을 넣을 수 없습니다.");
    }

    public void removeItem() {
        if (checkLess()) {
            System.out.println("더 이상 아이템을 삭제 할 수 없습니다.");
            return;
        }

        items[--index] = null;
    }

    public void printItems() {
        if (checkLess()) {
            System.out.println("현재 담은 아이템이 없습니다.");
            return;
        }

        System.out.println("현재 담은 아이템");
        for (Item item : items) {
            System.out.println("상품 이름 = " + item.getItemName() + " 상품 가격 = " + item.getPrice() + " 상품 수량 = " + item.getQuantity());
        }
    }

    public void getTotalPrice() {
        if (checkLess()) {
            System.out.println("현재 담은 아이템이 없습니다.");
            return;
        }

        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }

        System.out.println("현재 본인 카트에 총 결재 금액 = " + totalPrice);
    }

    // 비었는지 확인
    private boolean checkLess() {
        if (index == 0) {
            System.out.println("현재 담은 아이템이 없습니다.");
            return true;
        }

        return false;
    }

    // 가득찼는지 확인
    private boolean checkMore() {
        if (index < itemCount) {
            return false;
        }

        return true;
    }
}
