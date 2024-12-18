import java.util.Arrays;
import java.util.Stack;

public class SmallestElement {
    public int[] prevSmaller(int[] A) {
        int[] result = new int[A.length];
        Arrays.fill(result,-1);

        Stack<Integer> stack  = new Stack<>();


        for(int i=0;i<A.length;i++){
            while (!stack.isEmpty() && stack.peek() >= A[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            stack.push(A[i]);
        }

        return result;
    }
}
