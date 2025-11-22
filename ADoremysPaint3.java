import java.util.*;

public class ADoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            if (freq.size() > 2) {
                System.out.println("No");
                continue;
            }

            if (freq.size() == 1) {
                System.out.println("Yes");
                continue;
            }
            List<Integer> f = new ArrayList<>(freq.values());
            int a = f.get(0);
            int b = f.get(1);

            if (a == b) System.out.println("Yes");
            else if (Math.abs(a - b) == 1 && n % 2 == 1) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
