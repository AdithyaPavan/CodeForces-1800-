
import java.util.*;
public class MakeitDivisibleby25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           String s=sc.next();
           String []pos={"00","25","50","75"};
           int res=Integer.MAX_VALUE;
           for(String i:pos){
            char a=i.charAt(0);
            char b=i.charAt(1);
            int posa=-1;
            int posb=-1;
            for(int r=s.length()-1;r>=0;r--){
                if(s.charAt(r)==b){
                    posb=r;
                    break;
                }
            }
            if(posb==-1)continue;
            for(int l=posb-1;l>=0;l--){
                if(s.charAt(l)==a){
                    posa=l;
                    break;
                }
            }
            if(posa==-1)continue;
            int movs=(posb-posa-1)+(s.length()-1-posb);
            res=Math.min(res,movs);
           }
           System.out.println(res);
            
        }
        sc.close();
    }
}