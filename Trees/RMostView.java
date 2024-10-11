import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RMostView {
    public List<Integer> rightView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int rights = 0;
            for(int i = 0;i<size;i++){
                TreeNode currNode = q.poll();
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
                rights = currNode.val;

            }
            result.add(rights);
        }

        return result;
    }
}
