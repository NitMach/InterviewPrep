import java.util.Arrays;

public class KokoEatingBannana {
    public int minEatingSpeed(int[] piles, int h) {
        // Arrays.sort(piles);
        int left = 1, right = Arrays.stream(piles).max().getAsInt();;
        int minBananas = right;

        while(left<=right){
            int mid = left + (right - left)/2;
            int totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / mid);
            }
            if(totalTime <= h){
                minBananas = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return minBananas;
    }
}
