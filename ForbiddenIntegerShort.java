import java.util.*;

public class ForbiddenIntegerShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            x = (x < 2) ? 2 : 1;

            if (k < x + n % x) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int cnt = n / x;
                System.out.println(cnt);

                for (int i = 0; i < cnt - 1; i++)
                    System.out.print(x + " ");

                System.out.println(x + n % x);
            }
        }
        sc.close();
    }
}
