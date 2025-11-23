import java.util.*;

public class MakeitBeautiful {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           int l=arr[0];
           int h=arr[n-1];
           if(l==h){
                System.out.println("NO");
           }else{
                System.out.println("YES");
                System.out.print(h+" ");
                for(int i=0;i<n-1;i++){
                    System.out.print(arr[i]+" ");
                }
           }
        }
        sc.close();
    }
}
