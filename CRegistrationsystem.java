import java.util.*;

public class CRegistrationsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> mp = new HashMap<>();

        while (n-- > 0) {
            String s = sc.next(); 
            if (!mp.containsKey(s)) {
                System.out.println("OK");
                mp.put(s, 0);
            } else {
                int cnt = mp.get(s) + 1;
                mp.put(s, cnt);
                System.out.println(s + cnt);
            }
        }

        sc.close();
    }
}
