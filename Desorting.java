import java.util.*;
public class Desorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           boolean sorted=true;
           int mindif=Integer.MAX_VALUE;
           for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1])sorted=false;
                int val=arr[i+1]-arr[i];
                mindif=Math.min(mindif,val);
           }
           if(!sorted){
                System.out.println(0);
           }else{
                System.out.println(mindif/2+1);
           }
        }
        sc.close();
    }
}