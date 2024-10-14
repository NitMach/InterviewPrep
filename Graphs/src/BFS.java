import java.util.*;

public class BFS {

    public List<Integer> bfsofGraph(int V, List<List<Integer>> adj){
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q =  new LinkedList<>();
        boolean[] visited = new boolean[V];
        q.add(0);
        visited[0] = true;

        bfs(adj,result,q,visited);
        return result;
    }

    private void bfs(List<List<Integer>> adj, List<Integer> result, Queue<Integer> q, boolean[] visited){
        while(!q.isEmpty()){
            int currNode = q.poll();
            result.add(currNode);
            for(int neighbor : adj.get(currNode)){
                if(!visited[neighbor]){
                    q.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
