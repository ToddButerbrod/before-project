public class Main {
    static String symbol = "0";

    public static void main(String[] args) {

        int n = 101;
        int k = 0;

        while (k < n) {
            k = k + 1;
            int b = 101;
            while (b > k) {
                b = b - 1;
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}