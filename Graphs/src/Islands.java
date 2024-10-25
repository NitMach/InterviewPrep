public class Islands {
    public int numIslands(char[][] grid) {
        int row = grid.length, column = grid[0].length;
        int count = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                if(grid[i][j] == '1'){
                    helper(grid, i, j);
                    count += 1;
                }
            }
        }
        return count;
    }

    private void helper(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        helper(grid, i + 1, j);
        helper(grid, i, j + 1);
        helper(grid, i - 1, j);
        helper(grid, i, j - 1);
    }
}
