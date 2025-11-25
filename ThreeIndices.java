import java.util.*;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean val=true;
            for(int j=1;j<n-1;j++){
                int l=-1;
                int r=-1;
                for(int i=0;i<j;i++){
                    if(arr[i]<arr[j]){
                        l=i;
                        break;
                    }
                }
                for(int k=n-1;k>j;k--){
                    if(arr[k]<arr[j]){
                        r=k;
                        break;
                    }
                }
                if(l!=-1&&r!=-1){
                    System.out.println("YES");
                    System.out.println((l+1)+" "+(j+1)+" "+(r+1));
                    val=false;
                    break;
                }
            }
            if(val)System.out.println("NO");
        }
        sc.close();
    }
}