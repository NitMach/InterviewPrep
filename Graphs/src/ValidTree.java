import java.util.ArrayList;
import java.util.List;

public class ValidTree {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i=0; i<n;i++){
            if(!visited[i]){
                count += 1;
                if(dfs(i, -1, adj, visited)){
                    return false;
                }
            }
        }
        if(count > 1) return false;
        return true;
    }

    private boolean dfs(int node, int parent, List<List<Integer>> adjList, boolean[] visited){
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, adjList, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}
