import java.util.ArrayList;
import java.util.List;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        if(V==0) return result;
        boolean[] visited = new boolean[V];
        dfs(adj,visited,result,0);
        return result;
    }

    private static void dfs(List<List<Integer>> adj, boolean[] visited, ArrayList<Integer> result, int node){
        if(!visited[node]){
            visited[node] = true;
            result.add(node);
            for(int neighbor : adj.get(node)){
                dfs(adj,visited,result,neighbor);
            }
        }
    }
 }
