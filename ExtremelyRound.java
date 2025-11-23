import java.util.*;

public class ExtremelyRound {
    static boolean check(long x) {
        long digits = 0, zeros = 0;
        while (x > 0) {
            if (x % 10 == 0)
                zeros++;
            digits++;
            x /= 10;
        }
        return zeros == digits - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> roundNumbers = new ArrayList<>();
        for (long i = 1; i <= 999999; i++) {
            if (check(i))
                roundNumbers.add(i);
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 0;
            for (long x : roundNumbers) {
                if (x <= n)
                    ans++;
                else
                    break;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
