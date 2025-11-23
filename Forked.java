import java.util.*;

public class Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk= sc.nextInt();
            int xq= sc.nextInt();
            int yq= sc.nextInt();
            int dx[]={-1,-1,1,1};
            int dy[]={-1,1,-1,1};
            Set<Pair>k=new HashSet<>();
            Set<Pair>q=new HashSet<>();
            for(int i=0;i<4;i++){
                k.add(new Pair(xk+dx[i]*a,yk+dy[i]*b));
                k.add(new Pair(xk+dx[i]*b ,yk+dy[i]*a));
                q.add(new Pair(xq+dx[i]*a ,yq+dy[i]*b));
                q.add(new Pair(xq+dx[i]*b ,yq+dy[i]*a));
            }
            int res=0;
            for(Pair s:k){
                if(q.contains(s)){
                    // System.out.println(s+"    "+k);
                    res++;
                }
            }
            System.out.println(res);

            
        }
        sc.close();
    }
    static class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public boolean equals(Object o){
            if(this==o)return true;
            if (!(o instanceof Pair))
                return false;
            Pair p=(Pair)o;
            return x==p.x&&y==p.y;
        }
        @Override        
        public int hashCode(){
            return Objects.hash(x,y);
        }
    }
}