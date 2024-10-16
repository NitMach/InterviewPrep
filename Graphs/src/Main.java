import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int V = 5;

        List<List<Integer>> adj = GraphDriver.createGraph(V);


        BFS bfs = new BFS();
        List<Integer> bfsResult = bfs.bfsofGraph(V, adj);
        System.out.println("BFS Traversal of the graph starting from node 0:- "+bfsResult);

        DFS dfs = new DFS();
        ArrayList<Integer> dfsResult = dfs.dfsOfGraph(V,adj);
        System.out.println("DFS traversal of the graph starting form node 0:- "+dfsResult);

        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        ConnectedComponents con = new ConnectedComponents();
        int count = con.findCircleNum(isConnected);
        System.out.println("Number of provinces LC(547) :- " + count);
    }
}