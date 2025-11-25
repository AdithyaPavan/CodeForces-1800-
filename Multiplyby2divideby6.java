
import java.util.*;
public class Multiplyby2divideby6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           long n=sc.nextInt();
           long res3=0;
           while(n%3==0){
                n/=3;
                res3++;
           }
           int res2=0;
           while(n%2==0){
                n/=2;
                res2++;
           }
           if(n>1 || (res2>res3))System.out.println(-1);
           else System.out.println(res3+(res3-res2));
          
        }
        sc.close();
    }
}