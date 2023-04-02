class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count ++;
                    visitIsland(grid, i, j);
                }
            }
        }
        return count;
    }

    private void visitIsland(char[][] grid, int m, int n) {
        if (m<0 || m>= grid.length || n<0 || n>=grid[0].length || grid[m][n] != '1') {
            return;
        }
        grid[m][n] = '2';

        visitIsland(grid, m-1, n);
        visitIsland(grid, m+1, n);
        visitIsland(grid, m, n-1);
        visitIsland(grid, m, n+1);
    }
}
