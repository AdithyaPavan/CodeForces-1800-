
import java.util.*;
public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int k=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           Arrays.sort(arr);
           int curr=0;
           int max=0;
           for(int i=1;i<n;i++){
                if(arr[i]-arr[i-1]<=k)curr++;
                else curr=0;
                max = Math.max(curr, max);
           }
           System.out.println(n-max-1);
        }
        sc.close();
    }
}