import java.util.LinkedList;
import java.util.Queue;

public class IslandTrees {
    private static final int TREASURE = 0;
    private static final int LAND = Integer.MAX_VALUE;

    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        //add all treasure chest to the queue
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j] == TREASURE){
                    q.add(new int[]{i,j});
                }
            }
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] direction : directions) {
                int r = row + direction[0];
                int c = col + direction[1];

                if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != LAND) {
                    continue;
                }

                grid[r][c] = grid[row][col] + 1;
                q.add(new int[] { r, c });
            }
        }
    }
}
