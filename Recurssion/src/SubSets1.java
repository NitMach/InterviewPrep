import java.util.ArrayList;
import java.util.List;

public class SubSets1 {
    //pick not pick
    //recursion as they are asking us to find all possible subsets
    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> subset = new ArrayList<>();
        generateSubsets(nums,0,new ArrayList<>(),subset);
        return subset;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> subset){
        if(index == nums.length){
            subset.add(new ArrayList<>(current));  //base case we are adding this into the result arrayList
            return;
        }
        current.add(nums[index]);
        generateSubsets(nums,index+1,current,subset); //Picking the number condition
        current.remove(current.size()-1);  //Backtracking or removing
        generateSubsets(nums,index+1,current,subset); //not picking the number condition
    }
}
