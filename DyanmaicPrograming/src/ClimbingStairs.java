/*
* Intution:- at each step i have two choices either i can jump 1 step or 2 steps
* lets say i am at the nth step how can i reach there?
* There are 2 ways either from n - 2 or n - 1
* So i just need to find how many steps did it take to rach that n-2 th step and the n-1 th step
* base case if 0 th and 1 st step you only need 1
* */

public class ClimbingStairs {

    public int climb(int n){
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
