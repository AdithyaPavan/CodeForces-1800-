
import java.util.*;
public class B01Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           String s=sc.next();
           int res=0;
           int cz=0;
           int co=0;
           for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0')cz++;
                else co++;
           }
           res=Math.min(cz,co);
           System.out.println(res%2==1?"DA":"NET");
        }
        sc.close();
    }
}