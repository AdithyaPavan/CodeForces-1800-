import java.util.*;

public class ExcitingBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println(0 + " " + 0);
            } else {
                long g = Math.abs(a - b);
                long r = a % g;
                long res = Math.min(r, g - r);
                System.out.println(g + " " + res);
            }
        }
        sc.close();
    }
}
