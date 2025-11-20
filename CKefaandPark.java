import java.util.*;

public class CKefaandPark {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] hasCat;
    static int n, m;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        hasCat = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            hasCat[i] = sc.nextInt();
        }

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n + 1];
        dfs(1, hasCat[1], visited);

        System.out.println(answer);
        sc.close();
    }

    static void dfs(int node, int consecutiveCats, boolean[] visited) {
        visited[node] = true;

        if (consecutiveCats > m) return;

        boolean isLeaf = true;

        for (int child : graph.get(node)) {
            if (!visited[child]) {
                isLeaf = false;
                int nextConsecutive = (hasCat[child] == 1) ? consecutiveCats + 1 : 0;
                dfs(child, nextConsecutive, visited);
            }
        }

        // A leaf is a node that isn't the root and has no unvisited children
        if (isLeaf && node != 1) {
            answer++;
        }
    }
}
