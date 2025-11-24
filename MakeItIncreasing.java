
import java.util.*;
public class MakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           int res=0;
           boolean val=false;
           for(int i=n-1;i>=1;i--){
                while(arr[i-1]>=arr[i]){
                    arr[i-1]/=2;
                    res++;
                    if(arr[i-1]==0&&arr[i]==0){
                        val=true;
                        break;
                    }
                }
                if(val)break;
           }
           System.out.println(!val?res:-1);
        }
        sc.close();
    }
}