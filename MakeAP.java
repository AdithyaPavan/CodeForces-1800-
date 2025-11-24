
import java.util.*;
public class MakeAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        while (t-->0) {
           long a=sc.nextLong();
           long b=sc.nextLong();
           long c=sc.nextLong();
           boolean val=false;
           long ka=2*b-c;
           if(ka/a>0 && ka%a==0)val=true;
           long kb=(a+c)/2;
           if(kb/b>0&& kb%b==0 && (c-a)%2==0)val=true;
           long kc=2*b-a;
           if(kc/c>0 && kc%c==0)val=true;
           if(val)System.out.println("YES");
           else System.out.println("NO");
        }
        sc.close();
    }
}