import java.util.Arrays;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        /*
            1)Use 2 pointers where you fix the first pointer and second one is moves
            2)Move the 2 pointer untill the 1st pinter and diffrence
            3)store that in the PQ pair<value,frequency>
        */

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        int i = 0, n = nums.length;
        while (i < n) {
            int j = i;
            while (j < n && nums[j] == nums[i]) {
                j++;
            }

            int frequency = j - i;
            pq.add(new int[]{nums[i], frequency});

            i = j;
        }

        int[] result = new int[k];
        for (int l = 0; l < k; l++) {
            result[l] = pq.poll()[0];
        }

        return result;
    }
}
