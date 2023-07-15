class Solution {
    public int orangesRotting(int[][] grid) {
        int result = 0;
        while(true) {
            boolean infect = false;
            boolean freshOrange = false;

            for(int i=0; i<grid.length; i++) {
                for(int j=0; j<grid[0].length; j++) {
                    if(grid[i][j] == 2) {
                        grid[i][j] = 0;
                        if(infectCells(grid, i, j)) {
                            infect=true;
                        }
                    }
                }
            }

            for(int i=0; i<grid.length; i++) {
                for(int j=0; j<grid[0].length; j++) {
                    if(grid[i][j] == 1) {
                        freshOrange = true;
                    } else if(grid[i][j]==3) {
                        grid[i][j]=2;
                    }
                }
            }

            if(infect) {
                result++;
            } else {
                if(freshOrange) {
                    result = -1;
                }
                break;
            }
        }
        return result;
    }

    private boolean infectCells(int[][] grid, int i, int j) {
        int[][] directions = {{-1,0}, {1,0}, {0, -1}, {0, 1}};
        boolean result = false;
        for(int[] direction:directions) {
            int row = i+direction[0];
            int col = j+direction[1];
            if(row>=0 && col>=0 && row<grid.length && col<grid[0].length && grid[row][col]==1) {
                grid[row][col]=3;
                result=true;
            }
        }
        return result;
    }
}
