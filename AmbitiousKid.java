import java.util.*;
public class AmbitiousKid    {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        boolean haszero=false;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0)haszero=true;
            mini=Math.min(mini,Math.abs(0-arr[i]));
        }
        if(haszero){
            System.out.println(0);
        }else{
            System.out.println(mini);
        }
        sc.close();
    }
}