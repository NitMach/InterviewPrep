import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectedComponents {
    public int findCircleNum(int[][] isConnected) {

        //Step 1 conver the matrix to adjacency list
        int m = isConnected.length;
        int n = isConnected[0].length;
        //Create an adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<m; i++){
            adj.add(new ArrayList<>());
            for(int j = 0; j<n; j++){
                if(isConnected[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[adj.size()];
        int count = 0;
        Queue<Integer> q =  new LinkedList<>();
        for(int i = 0; i<visited.length;i++){
            if(!visited[i]){
                q.add(i);
                bfs(adj, visited, q);
                count++;
            }
        }
        return count;
    }

    private void bfs(List<List<Integer>> adj, boolean[] visited, Queue<Integer> q) {
        while(!q.isEmpty()){
            int currNode = q.poll();
            for(int neighbor : adj.get(currNode)){
                if(!visited[neighbor]){
                    q.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

}
