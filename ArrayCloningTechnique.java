
import java.util.*;
public class ArrayCloningTechnique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int arr[]=new int[n];
           HashMap<Integer,Integer>mp=new HashMap<>();
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mp.put(arr[i],mp.getOrDefault(arr[i],0 )+1);
           }
           int max=0;
           for(int i:mp.values()){
                max=Math.max(max,i);
           }
           int res=0;
           while(max<n){
                res++;
                if(max*2<=n){
                    res+=max;;
                    max*=2;
                }else{
                    res+=n-max;
                    max=n;
                }
           }
           System.out.println(res);
           
        }
        sc.close();
    }
}