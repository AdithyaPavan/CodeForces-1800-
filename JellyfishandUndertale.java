import java.util.*;

public class JellyfishandUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long res = b;
            for (int i = 0; i < n; i++) {
                res += Math.min(arr[i], a - 1);
            }
            System.out.println(res);

        }
        sc.close();
    }
}