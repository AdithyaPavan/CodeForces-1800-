
import java.util.*;
public class Raspberries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int k=sc.nextInt();
           int arr[]=new int[n];
           boolean vali=false;
           int ec=0;
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%k==0)vali=true;
            if(arr[i]%2==0)ec++;
           }
           long res = Integer.MAX_VALUE;
           if (vali) {
            System.out.println(0);
            continue;
           }
           for (int i = 0; i < n; i++) {
               int val = k - (arr[i] % k);
               res = (long) Math.min(res, val);
           }jehfi
           if(k==4){
            if(ec>=2)res=Math.min(res,0L);
            else if(ec==1)res=Math.min(res,1L);
            else res=Math.min(res,2L);
           }
           System.out.println(res);
        }
        sc.close();
    }
}