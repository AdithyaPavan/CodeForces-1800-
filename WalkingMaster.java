import java.util.*;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();
            if(d<b){
                System.out.println(-1);
                continue;
            }else{
                int ymov=d-b;
                int xmov=a+ymov;
                if(xmov<c){
                    System.out.println(-1);
                    continue;
                }
                System.out.println(ymov+(xmov-c));
            }
        }
        sc.close();
    }
}