import java.util.ArrayList;
import java.util.Arrays;
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


        int[][] graph = {
                {1, 2},     // Neighbors of node 0
                {0, 3, 4},  // Neighbors of node 1
                {0, 4},     // Neighbors of node 2
                {1, 5},     // Neighbors of node 3
                {1, 2},     // Neighbors of node 4
                {3}         // Neighbors of node 5
        };

        // Create an object of the class that contains bfsTraversal
        BFSMatrix gt = new BFSMatrix();
        List<Integer> result = gt.bfsTraversal(graph);
        System.out.println("bfs graph traversal where input is an matrix :- " + result);

        //Cycle in the undirected graph
        Cycle cycle = new Cycle();
        boolean result2 = cycle.isCycle(5,adj);
        System.out.println("Check if the graph has cycle :- " + result2);


        //Food Fill
        FoodFillImage foodFillImage = new FoodFillImage();
        int[][] result3 = foodFillImage.foodFill(isConnected,1,1,2);
        System.out.println("Food Fill LC(733) :- "+Arrays.deepToString(result3));
    }
}