import java.util.List;
import java.util.function.BooleanSupplier;

public class Main {

    public static void main(String[] args) {
        //Intput tree
        InputTree in  = new InputTree();
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        TreeNode root = in.input(input);

        //passing to test level order traversal
        LevelOrderTraversalTrees Bfs = new LevelOrderTraversalTrees();
        List<List<Integer>> result = Bfs.bfs(root);
        System.out.println("BTLevelOrdertraversal LC(107) :- "+result);


        //ZIgZag binary tree
        ZigZag zzbfs = new ZigZag();
        List<List<Integer>> result1 = zzbfs.zigzag(root);
        System.out.println("Zig zag BT LC(103) :- "+result1);

    }
}