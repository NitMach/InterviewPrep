import java.util.HashSet;
import java.util.Set;

//T.C O(n) S.c O(n)
public class HasDuplicates {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set  = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i])) return true;
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
