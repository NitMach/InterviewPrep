import java.util.ArrayList;
import java.util.List;

public class GraphDriver {

    // Method to build the adjacency list for the graph
    public static List<List<Integer>> createGraph(int V) {
        // Create a list of lists to represent the adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the adjacency list
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(2);

        return adj;
    }
}