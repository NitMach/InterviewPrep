public class FoodFillImage {
    public int[][] foodFill(int[][] image, int sr, int sc, int color){
        int intialColor = image[sr][sc];

        if(intialColor != color) dfs(image, sr, sc, intialColor, color);

        return  image;
    }

    private void dfs(int[][] image, int r, int c, int initialColor ,int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != initialColor) {
            return;
        }

        image[r][c] = newColor;

        dfs(image, r + 1, c, initialColor, newColor); // down
        dfs(image, r - 1, c, initialColor, newColor); // up
        dfs(image, r, c + 1, initialColor, newColor); // right
        dfs(image, r, c - 1, initialColor, newColor); // left
    }

}
