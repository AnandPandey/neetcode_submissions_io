class Solution {
    int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2){
                    dfs(grid, i, j, 2);
                }
            }
        }
        int maxTime = 2;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
                maxTime = Math.max(maxTime, grid[i][j]);
            }
        }
        return maxTime == 2 ? 0 : maxTime - 2;
    }

    private void dfs(int[][] grid, int i, int j, int time){
        int rows = grid.length;
        int cols = grid[0].length;

        if(i < 0 || j < 0 || i >= rows || j >= cols) return;

        if(grid[i][j] == 0 || (grid[i][j] > 1 && grid[i][j] < time)) return;

        grid[i][j] = time;

        for(int[] dir : directions){
            dfs(grid, i + dir[0], j + dir[1], time + 1);
        }
    }
}