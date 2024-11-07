import java.util.List;
import java.util.PriorityQueue;

public class Prims {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        int sum = 0;
        boolean[] visited = new boolean[V];

        // Min-heap to store (weight, vertex)
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Start with node 0 and add its edges to the min-heap
        minHeap.add(new int[]{0, 0}); // Starting node with weight 0

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int weight = curr[0];
            int node = curr[1];

            // If the node is already visited, skip it
            if (visited[node]) continue;

            // Mark this node as visited and add its weight to the MST sum
            visited[node] = true;
            sum += weight;

            // Add all adjacent edges to the min-heap
            for (int[] neighbor : adj.get(node)) {
                int neighborNode = neighbor[0];
                int edgeWeight = neighbor[1];

                // Only add edges leading to unvisited nodes
                if (!visited[neighborNode]) {
                    minHeap.add(new int[]{edgeWeight, neighborNode});
                }
            }
        }

        return sum;
    }
}
