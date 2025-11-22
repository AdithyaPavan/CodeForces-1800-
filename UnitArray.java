import java.util.*;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int pos=0;
            int neg=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]>0)pos++;
                else neg++;
            }
            int res=0;
            while(pos<neg|| neg%2==1){
                res++;
                pos++;
                neg--;
            }
            System.out.println(res);
            
        }
        sc.close();
    }
}