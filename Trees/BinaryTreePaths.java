import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> allPaths(TreeNode root){
        List<String> result = new ArrayList<>();
        if(root == null) return result;
        dfs(result,root,new StringBuffer());
        return result;
    }

    private void dfs(List<String> result, TreeNode node, StringBuffer path) {
        int length = path.length();
        path.append(node.val);
        if(node.left == null && node.right == null) result.add(path.toString());
        else{
            path.append("->");
            if(node.left != null) dfs(result,node.left,path);
            if(node.right != null) dfs(result,node.right,path);
        }
        path.setLength(length);
    }

}
