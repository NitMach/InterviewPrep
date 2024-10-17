import java.util.Arrays;

public class Fibnnoci {

    public int fib(int num,int[] memo){
      if(num<=1){
          return num;
      }
      if(memo[num] != -1){
          return memo[num];
      }
      memo[num] = fib(num-1,memo) + fib(num-2,memo);
      return memo[num];
    }


    /*
    This is the recursive code

    //Base Case
        if(num==0) return 0;
        if(num==1) return 1;

        //Recursive equation
        return fib(num-1) + fib(num-2);
    */
}
