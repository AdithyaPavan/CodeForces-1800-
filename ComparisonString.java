
import java.util.*;
public class ComparisonString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           String s=sc.next();
           int len=0;
           int cur=0;
           for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1))cur++;
                else cur=0;
                len=Math.max(len,cur);

           }
           System.out.println(len+2);
        }
        sc.close();
    }
}