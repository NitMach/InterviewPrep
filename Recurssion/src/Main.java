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
    }
}