import java.util.*;

public class ZigZag {
    public List<List<Integer>> zigzag(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 1;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode curr = q.poll();
                temp.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(count %2 == 0){
                Collections.reverse(temp);
                result.add(temp);
            }else{
                result.add(temp);
            }
            count+=1;
        }

        return result;
    }
}

/*
 * T.C = You are traversing each node once so if there are n nodes O(N)
 * S.C = You are using a result list to store the nodes O(N)
 *
 * I am using the collections to revers the array but this can be optimized by inserting at the temp arrayList from end
 * */
