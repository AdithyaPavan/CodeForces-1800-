import java.util.*;

public class OlyaandGamewithArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> res = new ArrayList<>();

            int globalMin = Integer.MAX_VALUE; 

            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                int arr[] = new int[m];

                for (int j = 0; j < m; j++) {
                    arr[j] = sc.nextInt();
                }

                Arrays.sort(arr);

                globalMin = Math.min(globalMin, arr[0]);
                res.add(arr[1]); 
            }

            long sum = 0;
            int minSecond = Integer.MAX_VALUE;
            for (int x : res) {
                sum += x;
                minSecond = Math.min(minSecond, x);
            }

            long ans = globalMin + (sum - minSecond);
            System.out.println(ans);
        }
        sc.close();
    }
}
