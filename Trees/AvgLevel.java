import java.util.LinkedList;
import java.util.Queue;

public class AvgLevel {

    public int avgLevelBt(TreeNode root){
        int result  = 0;
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int currAvg = 0;
            for(int i = 0; i<size;i++){
                TreeNode curr =  q.poll();
                currAvg+= curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            if(result < (currAvg/size)) result = (currAvg/size);
        }
        return result;
    }
}
