import java.util.Arrays;
import java.util.Stack;

public class NGE2 {
    public int[] nge(int[] nums){
        int[] result = new int[nums.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * nums.length; i++) {
            int index = i % nums.length;

            while (!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                result[stack.pop()] = nums[index];
            }

            stack.push(index);
        }

        return result;

    }
}
