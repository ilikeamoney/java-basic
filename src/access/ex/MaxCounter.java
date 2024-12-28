package access.ex;

public class MaxCounter {

    private int counter = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (counter >= max) {
            System.out.println("최댓값에 도달했습니다.");
            return;
        }
        counter++;
    }

    public int getCount() {
        return counter;
    }
}
