
import java.util.*;
public class SkiResort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           long k=sc.nextLong();
           long q=sc.nextLong();
           long arr[]=new long[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
           }
           long res=0;
           long cnt=0;
           for(int i=0;i<n;i++){
            if(arr[i]<=q)cnt++;
            else{
                if(cnt>=k)res+=(cnt-k+2)*(cnt-k+1)/2;
                cnt=0; 
            }
           }
           if(cnt>=k)res+=(cnt-k+2)*(cnt-k+1)/2;
           System.out.println(res);

        }
        sc.close();
    }
}