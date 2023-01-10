class Solution {
    int row, colm;

    public boolean exist(char[][] board, String word) {
        // find first char in the board
        char[] wordArr = word.toCharArray();
        row = board.length;
        colm = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                if (board[i][j] == wordArr[0] && findWord(board, i, j, 0, wordArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    // backtracking from that char
    public boolean findWord(char[][] board, int i, int j, int wordIndx, char[] wordArr) {
        //check conditions

        if (wordIndx == wordArr.length) {
            return true;
        }

        if (i < 0 || j < 0 || i >= row || j >= colm || board[i][j] == '$') {
            return false;
        }

        if (board[i][j] != wordArr[wordIndx]) {
            return false;
        }

        //mark current char visited by replacing char to $

        char temp = board[i][j];
        board[i][j] = '$';

        // 4 directions for perticular char
     // now check for true condition in 4 directions of the corrent indx

        if (
            findWord(board, i + 1, j, wordIndx + 1, wordArr) ||
            findWord(board, i, j + 1, wordIndx + 1, wordArr) ||
            findWord(board, i - 1, j, wordIndx + 1, wordArr) ||
            findWord(board, i, j - 1, wordIndx + 1, wordArr)
        ) {
            return true;
        }
        board[i][j] = temp;
        return false;
    }
}
