import java.util.*;
public class CTableDecorations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long r=sc.nextLong();
        long g=sc.nextLong();
        long b=sc.nextLong();
        long sum=r+g+b;
        long maxi=Math.max(r,Math.max(g,b));
        long res=Math.min(sum/3,sum-maxi);
        System.out.println(res);
        sc.close();
    }
}
