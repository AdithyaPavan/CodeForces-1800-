import java.util.*;
public class ABoredom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int maxi=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            maxi=Math.max(maxi,arr[i]);
        }
        long freq[]=new long[maxi+1];
        for(int o:arr){
            freq[o]++;
        }
        long dp[]=new long[maxi+1];
        dp[0]=0;
        if(maxi>=1)dp[1]=freq[1]*1;
        for(int i=2;i<=maxi;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+freq[i]*i);
        }
        System.out.println(dp[maxi]);
        sc.close();
    }
}
