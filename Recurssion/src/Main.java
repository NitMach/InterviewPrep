import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Classic pick not pick sub set problem
        SubSets1 s = new SubSets1();
        List<List<Integer>> subset = s.subset(new int[]{1, 2,3, 4});
        System.out.println("Subsets LC(78) :- "+subset);


        //Open close parenthesis problem
        OpenClose o = new OpenClose();
        List<String> result = o.generateParenthesis(3);
        System.out.println("Open close paranthesis LC(22) :- "+result);


        //COmbination Sum
        CombinationSum39 cms39 = new CombinationSum39();
        List<List<Integer>> result1 = cms39.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println("Combination Sum LC(39) :- " + result1);
    }
}