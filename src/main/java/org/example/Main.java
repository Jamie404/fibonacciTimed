public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int N = 20;

        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }

        long finish = System.currentTimeMillis();
        System.out.println(" ");
        long timeElapsed = finish - start;
        System.out.println("This took: " + timeElapsed + " milliseconds");
    }

    private static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }
}