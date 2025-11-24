
import java.util.*;
public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           long n=sc.nextLong();
           if(n<4 || n%2==1)System.out.println(-1);
           else{
                long max=n/4;
                long min=(n-1)/6+1;
                System.out.println(min+" "+max);
                
                
           }
           
        }
        sc.close();
    }
}