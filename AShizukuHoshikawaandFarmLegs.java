import java.util.*;
public class AShizukuHoshikawaandFarmLegs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int res=0;
            for(int cows=0;cows*4<=n;cows++){
                int remain=n-4*cows;
                if(remain%2==0)res++;
            }
            System.out.println(res);
        }
        sc.close();
    }
}