package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {}

    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        int sum = sum(arr);
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

}
