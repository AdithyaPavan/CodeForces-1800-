
import java.util.*;
public class StrangePartition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int x=sc.nextInt();
           int arr[]=new int[n];
           long sum=0;
           long maxi=0;

           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=(long)arr[i];
            maxi+=(long)(arr[i]+x-1)/x;
           }
           long mini=(long)(sum+x-1)/x;
           System.out.println(mini+" "+maxi);
           
        }
        sc.close();
    }
}