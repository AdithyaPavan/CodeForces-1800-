import java.util.*;

public class ArrayMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();

            int maxVal = 2 * n + 1;
            int[] fa = new int[maxVal];
            int[] fb = new int[maxVal];

          
            int cnt = 1;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1])
                    cnt++;
                else {
                    fa[a[i - 1]] = Math.max(fa[a[i - 1]], cnt);
                    cnt = 1;
                }
            }
            fa[a[n - 1]] = Math.max(fa[a[n - 1]], cnt);

            
            cnt = 1;
            for (int i = 1; i < n; i++) {
                if (b[i] == b[i - 1])
                    cnt++;
                else {
                    fb[b[i - 1]] = Math.max(fb[b[i - 1]], cnt);
                    cnt = 1;
                }
            }
            fb[b[n - 1]] = Math.max(fb[b[n - 1]], cnt);

            int ans = 1;
            for (int x = 1; x < maxVal; x++) {
                ans = Math.max(ans, fa[x] + fb[x]);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
