public class PathSum {

    public boolean pathSum(TreeNode root, int target){
        return helper(root,0,target);
    }

    private boolean helper(TreeNode root, int pathSum ,int target){
        if(root == null) return false;
        //add
        pathSum += root.val;
        //leafNode
        if(root.left != null && root.right != null) return pathSum == target;

        //recurssion on left and right
        boolean leftPath = helper(root.left, pathSum, target);
        boolean rightPath = helper(root.right,pathSum,target);

        return leftPath || rightPath;
    }
}
