
import java.util.*;

public class C1RenakoAmaoriandXORGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            int ca = 0, cb = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) ca++;
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] == 1) cb++;
            }

            if ((ca % 2) == (cb % 2)) {
                System.out.println("Tie");
                continue;
            }

            String ans = "";
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    ans = (i % 2 == 1 ? "Mai" : "Ajisai");
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}
