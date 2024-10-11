import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthLevelOrdere {

    public int maxDepth(TreeNode root){
        int result = 0;
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){
            int size = q.size();
            count++;
            for(int i = 0; i<size;i++){
                TreeNode currNode = q.poll();
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }
        }

        return count;
    }
}
