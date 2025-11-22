import java.util.*;
public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int maxi=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                maxi=Math.max(arr[i],maxi);
            }
            List<Integer>b=new ArrayList<>();
            List<Integer>c=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(arr[i]==maxi)c.add(arr[i]);
                else b.add(arr[i]);
            }
            if(b.size()==0)System.out.println(-1);
            else{
                System.out.println(b.size()+" "+c.size());
                for(int i=0;i<b.size();i++){
                    System.out.print(b.get(i)+" ");
                }
                System.out.println();
                for(int i=0;i<c.size();i++){
                    System.out.print(c.get(i)+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}