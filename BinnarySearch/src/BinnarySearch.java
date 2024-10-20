public class BinnarySearch {

    public int bs(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target) return mid;
            else if(target>arr[mid]) left = mid+1;
            else if(target<arr[mid]) right = mid-1;
        }
        return left;
    }
}
