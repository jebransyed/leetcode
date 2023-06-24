class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, visitIsland(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    private int visitIsland(int[][] grid, int i, int j) {
        if(i<0 || j<0 || i>=grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        } else {
            grid[i][j] = 2;
            return 1 + visitIsland(grid, i-1, j) + visitIsland(grid, i+1, j) + visitIsland(grid, i, j-1) + visitIsland(grid, i, j+1);
        }
    }
}
