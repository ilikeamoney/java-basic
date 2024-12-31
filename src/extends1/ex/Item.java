package extends1.ex;

/*
공통적인 개념은 부모 클래스로 정의를하고
세분화된 내용은 자식클래스에서 정의해서
각각 고유에 특성화된 개념들을 잘살려서 설계할 수 있다.
 */

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름 = " + name + " 가격 = " + price);
    }
}
