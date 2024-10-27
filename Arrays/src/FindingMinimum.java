public class FindingMinimum {
    //Rotated sorted array
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left< right){
            int mid = left + (right-left)/2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;  // Move to the right half
            }
            else {
                right = mid;  // Move to the left half including mid
            }
        }
        return nums[left];
    }
}
