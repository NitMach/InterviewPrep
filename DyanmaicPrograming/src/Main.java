import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Fibnnoci fib = new Fibnnoci();
        int[] memo = new int[10+1];
        Arrays.fill(memo,-1);
        int n = fib.fib(10,memo);
        System.out.println(n);

        ClimbingStairs c = new ClimbingStairs();
        int n_stairs = c.climb(10);
        System.out.println("Climbing Stairs LC(70) :- " + n_stairs);
    }
}