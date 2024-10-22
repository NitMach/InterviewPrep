public class maxWaterArea {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxWater = 0;

        while(left<right){
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);

            // Calculate the area (water) the container can hold
            int currentWater = width * height;
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer pointing to the shorter bar inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
