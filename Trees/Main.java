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


        //Right Most view in tree
        RMostView r = new RMostView();
        List<Integer> result2 =  r.rightView(root);
        System.out.println("Right most view of the tree LC(199) :- "+result2);

        //Max depth of the tree this used level order traversal but we can do using dfs
        MaxDepthLevelOrdere maxDeep = new MaxDepthLevelOrdere();
        int result3 = maxDeep.maxDepth(root);
        System.out.println("Max depth using maxDepth level LC(104) :- "+result3);


        //All paths of an binnary tree
        BinaryTreePaths ro = new BinaryTreePaths();
        List<String> result4 = ro.allPaths(root);
        System.out.println("All paths from root to leaf LC(257) :- " + result4);

        System.out.println("Done performing all the functions");

    }
}