import java.util.*;

public class OddGrasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            long res;
            if (n % 4 == 1)
                res = -n;
            else if (n % 4 == 2)
                res = 1;
            else if (n % 4 == 3)
                res = n + 1;
            else
                res = 0;

            if (x % 2 != 0)
                System.out.println(x - res);
            else
                System.out.println(x + res);
        }
        sc.close();
    }
}
