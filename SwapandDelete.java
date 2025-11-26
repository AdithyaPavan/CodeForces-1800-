
import java.util.*;
public class SwapandDelete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           String s=sc.next();
           int cz=0;
           int co=0;
           for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')cz++;
            else co++;
           }
           int tlen=0;
           for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'&&co>0){
                co--;
                tlen++;
            }
            else if(s.charAt(i)=='1'&&cz>0){
                cz--;
                tlen++;
            }
            else break;
           }
           System.out.println(s.length()-tlen);
        }
        sc.close();
    }
}