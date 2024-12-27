package construct;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("책1", "홍길동", 50);
        b1.displayInfo();

        Book b2 = new Book("책2", "김철수");
        b2.displayInfo();

        Book b3 = new Book();
        b3.displayInfo();
    }
}
