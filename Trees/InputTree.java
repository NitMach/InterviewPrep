import java.util.LinkedList;
import java.util.Queue;

public class InputTree {
    public TreeNode input(int[] inputArray){
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(inputArray[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < inputArray.length) {
            TreeNode current = queue.poll();

            if (i < inputArray.length) {
                current.left = new TreeNode(inputArray[i]);
                queue.offer(current.left);
                i++;
            }

            if (i < inputArray.length) {
                current.right = new TreeNode(inputArray[i]);
                queue.offer(current.right);
                i++;
            }
        }

        return root;
    }
}
