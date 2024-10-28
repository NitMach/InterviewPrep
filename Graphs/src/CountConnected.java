import java.util.ArrayList;
import java.util.List;

public class CountConnected {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        int componentCount = 0;

        for(int i = 0; i<n; i++){
            if(!visited[i]){
                componentCount+=1;
                visited[i] = true;
                dfs(i, adjList, visited);
            }
        }
        return componentCount;
    }

    private static void dfs(int node, List<List<Integer>> adjList, boolean[] visited){
        for(int neighbor: adjList.get(node)){
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                dfs(neighbor, adjList, visited);
            }
        }
    }
}
