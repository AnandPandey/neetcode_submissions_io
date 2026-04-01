class Solution {
    int area = 0, max_area = 0;
    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    max_area = Math.max(max_area,area);
                    area = 0;
                }
            }
        }
        return max_area;
    }

    private void dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>= grid.length ||
            j>= grid[0].length || grid[i][j]==0){
                return;
        }
        area += 1;
        grid[i][j] = 0;
        for(int[] dir : directions){
            dfs(grid, i + dir[0], j + dir[1]);
        }
    }
}
