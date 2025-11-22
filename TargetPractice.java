import java.util.*;
public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while (k-->0) {
            char a[][]=new char[10][10];
            for(int i=0;i<10;i++){
                String s=sc.next();
                for(int j=0;j<10;j++){
                    a[i][j]=s.charAt(j);
                }
            }
            int mat[][]=new int[10][10];
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    int t=i;
                    int l=j;
                    int b=10-i-1;
                    int r=10-j-1;
                    int val=Math.min(Math.min(t,l),Math.min(b, r))+1;
                    mat[i][j]=val;
                }
            }
            int res=0;
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(a[i][j]=='X')res+=mat[i][j];
                }
            }
            System.out.println(res);

        }
    }
}