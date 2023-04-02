class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(word.charAt(0) == board[i][j]) {
                    if(wordExists(board, i, j, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean wordExists(char[][] board, int i, int j, String word) {
        if(word == "") {
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length) {
            return false;
        }

        if(word.charAt(0) == board[i][j]) {
            String newWord = word.substring(1);
            char temp = board[i][j];
            board[i][j] = ' ';
            boolean exists = wordExists(board, i-1, j, newWord) || wordExists(board, i+1, j, newWord)
                || wordExists(board, i, j-1, newWord) || wordExists(board, i, j+1, newWord);
            board[i][j] = temp;
            return exists;
        } else {
            return false;
        }
    }
}
