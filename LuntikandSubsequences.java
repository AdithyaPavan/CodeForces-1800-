import java.util.*;

public class LuntikandSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int cz = 0, co = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0)
                    cz++;
                else if (x == 1)
                    co++;
            }

            long res = (long) Math.pow(2, cz) * co; 
            System.out.println(res);
        }
        sc.close();
    }
}
