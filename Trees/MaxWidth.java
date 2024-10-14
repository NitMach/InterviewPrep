import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {

    public int max_width(TreeNode root){
        int result = 0;
        if(root == null) return result;

        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 0));

        while(!q.isEmpty()){
            int size = q.size();
            int minPos = q.peek().getValue();
            int first = 0, last = 0;
            for(int i=0;i<size;i++){
                Pair<TreeNode, Integer> curr = q.poll();
                TreeNode node = curr.getKey();
                int pos = curr.getValue() - minPos;

                if (i == 0) first = pos;
                if (i == size - 1) last = pos;

                if (node.left != null) q.add(new Pair<>(node.left, 2 * pos));
                if (node.right != null) q.add(new Pair<>(node.right, 2 * pos + 1));
            }
            result = Math.max(result, last - first + 1);
        }
        return result;
    }
}
