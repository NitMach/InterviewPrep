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

        //Max Width of an binnary tree
        MaxWidth mx = new MaxWidth();
        int result5 = mx.max_width(root);
        System.out.println("Max width of an binnary tree LC(662) :- " + result5);


        //LCA
        LCA lc = new LCA();
        TreeNode result6 = lc.lca(root,root.left,root.right);
        System.out.println("LCA LC(236) :- " + result6.val);

        //Cousins of BT
        CousinsOfBT cousin = new CousinsOfBT();
        boolean result7 = cousin.counsins(root,9,8);
        System.out.println("Cousins of Binnary Tree LC(993) :- " + result7);

        //PathSum of BT
        PathSum pathSum = new PathSum();
        boolean result8 = pathSum.pathSum(root, 10);
        System.out.println("pathSum of the binary Tree LC(112) :- " + result8);

        System.out.println("Done performing all the functions in recurssion");

    }
}