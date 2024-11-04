class InPre {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        // Base case
        if (preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inRoot = inStart;
        while (inorder[inRoot] != root.val) {
            inRoot++;
        }
        int leftTreeSize = inRoot - inStart;

        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftTreeSize, inorder, inStart, inRoot - 1);
        root.right = buildTreeHelper(preorder, preStart + leftTreeSize + 1, preEnd, inorder, inRoot + 1, inEnd);

        return root;
    }
}
