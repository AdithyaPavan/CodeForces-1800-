import java.util.*;

public class BlankSpace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int res=0;
            int cz=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0)cz++;
                else cz=0;
                res=Math.max(res,cz);
            }
            System.out.println(res);
        }
        sc.close();
    }
}