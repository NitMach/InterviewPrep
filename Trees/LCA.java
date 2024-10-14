public class LCA {
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        //Base Case
        if(root == null) return null;

        //found either p or q
        if(root == p || root == q) return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if (left != null && right != null) return root;

        return left != null ? left : right;

    }
}
