import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CousinsOfBT {

    public boolean counsins(TreeNode root, int x, int y){
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            Set<Integer> check = new HashSet<>();
            for(int i = 0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left !=null && curr.right != null){
                    if ((curr.left.val == x && curr.right.val == y) || (curr.left.val == y && curr.right.val == x)) return false;
                }
                check.add(curr.val);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            if(check.contains(x) && check.contains(y)) return true;
        }
        return false;
    }
}
