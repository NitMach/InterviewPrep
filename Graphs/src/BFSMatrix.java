import java.util.*;

public class BFSMatrix {

    public List<Integer> bfsTraversal(int graph[][]){
        //Configuration
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        //Result
        List<Integer> result = new ArrayList<>();

        q.add(graph[0][0]);
        set.add(graph[0][0]);

        while(!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            for(int neighbor: graph[node]){
                if(!set.contains(neighbor)){
                    set.add(neighbor);
                    q.add(neighbor);
                }
            }
        }

        return result;
    }
}
