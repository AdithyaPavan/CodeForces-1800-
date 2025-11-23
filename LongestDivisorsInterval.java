
import java.util.*;

public class LongestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            long cur = 0;
            for (long i = 1;; i++) {
                if (n % i == 0) {
                    cur++;
                } else {
                    break;
                }
            }
            if (n == 1)
                System.out.println(1);
            else
                System.out.println(cur);
        }
        sc.close();
    }
}