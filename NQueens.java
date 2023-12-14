class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        String[][] board = getBoard(n);
        solveNQueens(board, 0, n, result);
        return result;
    }

    private void solveNQueens(String[][] board, int curr, int size, List<List<String>> result) {
        if(curr>=size) {
            result.add(getListFrom2DArray(board));
        } else {
            for(int i=0; i<size; i++) {
                if(isValid(board, curr, i)) {
                    board[curr][i] = "Q";
                    solveNQueens(board, curr+1, size, result);
                    board[curr][i] = ".";
                }
            }
        }
    }

    private boolean isValid(String[][] board, int row, int col) {
        for(int i=0; i<row; i++) {
            if(board[i][col] == "Q") {
                return false;
            }
        }

        int i=row-1, j=col-1;
        while(i>=0 && j>=0) {
            if(board[i][j] == "Q") {
                return false;
            }
            i--;
            j--;
        }

        i=row-1;
        j=col+1;
        while(i>=0 && j<board.length) {
            if(board[i][j] == "Q") {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    private String[][] getBoard(int n) {
        String[][] board = new String[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ".";
            }
        }
        return board;
    }

    private List<String> getListFrom2DArray(String[][] array) {
        List<String> list = new ArrayList<>();

        for (String[] row : array) {
            list.add(String.join("", row));
        }
        return list;
    }
}
