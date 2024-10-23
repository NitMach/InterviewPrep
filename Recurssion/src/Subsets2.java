import java.util.*;

public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        helperFunction(nums, set, new ArrayList<>(), 0);
        List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }

    public void helperFunction(int[] nums, Set<List<Integer>> set, List<Integer> path, int index ){
        if(index == nums.length){
            set.add(new ArrayList<>(path));
            return;
        }else{
            path.add(nums[index]);
            helperFunction(nums, set, path, index + 1);
            path.remove(path.size() - 1);
            helperFunction(nums, set, path, index + 1);
        }
    }
}
