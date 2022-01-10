public class _8_CountWaysToNthStair {
    public static Long countWays(int m) {
        return (long) m / 2 + 1;
    }

    public static void main(String[] args) {
        System.out.println(countWays(4));
    }
}
