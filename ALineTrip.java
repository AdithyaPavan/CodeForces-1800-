import java.util.*;
public class ALineTrip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int maxi=arr[0];
            for(int i=0;i<n-1;i++){
                maxi=Math.max(maxi,arr[i+1]-arr[i]);
            }
            
            
            maxi=Math.max(maxi,2*(x-arr[n-1]));
            System.out.println(maxi);
        }
    }
}
