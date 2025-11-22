import java.util.*;
public class ACoverinWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n =sc.nextInt();
            String s=sc.next();
            boolean has =false;
            for(int i=1;i<n-1;i++){
                if(s.charAt(i-1)=='.'&&s.charAt(i)=='.'&&s.charAt(i+1)=='.')has=true;
            }
            int cnt=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.')cnt++;
            }
            if(has)System.out.println(2);
            else System.out.println(cnt);
        }
        sc.close();
    }

}
