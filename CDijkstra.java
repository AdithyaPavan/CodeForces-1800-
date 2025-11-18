import java.util.*;
public class CDijkstra{
    static class Pair{
        int node;
        long weight;
        Pair(int n,long w){
            node=n;
            weight=w;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            long w=sc.nextInt();
            adj.get(a).add(new Pair(b,w));
            adj.get(b).add(new Pair(a,w));
        }
        long dis[]=new long[n+1];
        int parent[]=new int[n+1];
        Arrays.fill(dis,Long.MAX_VALUE);
        Arrays.fill(parent,-1);
        PriorityQueue<Pair>pq=new PriorityQueue<>((x,y)->Long.compare(x.weight,y.weight));
        dis[1]=0;
        pq.add(new Pair(1, 0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int u=curr.node;
            long d=curr.weight;
            if(d!=dis[u])continue;
            for(Pair p:adj.get(u)){
                int v=p.node;
                long w=p.weight;
                if(dis[u]+w<dis[v]){
                    dis[v]=dis[u]+w;
                    parent[v]=u;
                    pq.add(new Pair(v, dis[v]));
                }
            }
        }
        if(dis[n]==Long.MAX_VALUE){
            System.out.println(-1);
            return;
        }
        List<Integer>res=new ArrayList<>();
        for(int curr=n;curr!=-1;curr=parent[curr]){
            res.add(curr);
        }
        Collections.reverse(res);
        for(int x:res){
            System.out.println(x+" ");
        }

    }
}