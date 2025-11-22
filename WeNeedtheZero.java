import java.util.*;
public class WeNeedtheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int val=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                val^=arr[i];
            }
            if(n%2==1){
                System.out.println(val);
            }else{
                if(val==0){
                    System.out.println(0);
                }else System.out.println(-1);
            }
            
        }
        sc.close();
    }
}