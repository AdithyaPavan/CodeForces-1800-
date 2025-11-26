
import java.util.*;
public class Monsters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           long k=sc.nextLong();
           long arr[]=new long[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
           }
           for(int i=0;i<n;i++){
            if(arr[i]%k==0){
                arr[i]=k;
            }
            else{
                arr[i]=arr[i]%k;
            }
           }
           long val[][]=new long[n][2];
           for(int i=0;i<n;i++){
            val[i][0]=arr[i];
            val[i][1]=i+1;
           }
           Arrays.sort(val,(a,b)->{
                if(a[0]!=b[0])return Long.compare(b[0],a[0]);
                return Long.compare(a[1],b[1]);
           });
           for(long i[]:val){
            System.out.print(i[1]+" ");
           }
           System.out.println();

        }
        sc.close();
    }
}