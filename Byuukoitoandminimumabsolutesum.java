import java.util.*;
public class Byuukoitoandminimumabsolutesum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder res=new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            
            Integer first=(arr[0]==-1?null:arr[0]);
            Integer last=(arr[n-1]==-1?null:arr[n-1]);
            int minabs=(first!=null&&last!=null)?Math.abs(last-first):0;
            int out[]=Arrays.copyOf(arr,n);

            if(minabs==0){
                if(first==null&&last==null){
                    out[0]=0;
                    out[n-1]=0;
                }else if(first==null){
                    out[0]=out[n-1];
                }else if(last==null){
                    out[n-1]=out[0];
                }
                for(int i=1;i<n-1;i++)if(out[i]==-1)out[i]=0;
            }else{
                for(int i=0;i<n;i++)if(out[i]==-1)out[i]=0;
            }

            res.append(minabs).append('\n');
            for(int i=0;i<n;i++){
                if(i>0)res.append(' ');
                res.append(out[i]);
            }
            res.append('\n');
        }
        System.out.print(res.toString());
        sc.close();
    }
}
