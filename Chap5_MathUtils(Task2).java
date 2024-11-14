package max.n.min;

public class MathUtils {
    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}

