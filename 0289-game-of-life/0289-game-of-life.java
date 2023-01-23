class Solution {
    int row = 0;
    int col = 0;
    int count = 0;

    public void gameOfLife(int[][] board) {
        //1  less than 2 live 1 will be 0
        //1 with 2 or 3 1 will be 1
        //1 more than 3 1 will be 0
        //0 with 3 , '1' will be 1

        // 2 means 0 become 1
        //-1 means 1 become 0

        row = board.length;
        col = board[0].length;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    if (getCount(board, i, j) == 3) {
                        // 0 will become 1
                        board[i][j] = 2;
                    }
                } else {
                    //code for 1
                    int count = getCount(board, i, j);

                    if (count < 2 || count > 3) {
                        // 1 will become 0
                        board[i][j] = -1;
                    }
                }
            }
        }

        convertMatrix(board);
    }

    public int getCount(int[][] board, int i, int j) {
        //  System.out.println(i + " " + j);
        int count = 0;
        //8 direction for 1 coordiante
        int[][] dirs = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };

        for (int[] dir : dirs) {
            int i1 = i + dir[0];
            int j1 = j + dir[1];

            if (i1 < 0 || i1 >= row || j1 < 0 || j1 >= col) {
                continue;
            }
            if (board[i1][j1] == 1 || board[i1][j1] == -1) {
                count++;
                //0 with 3 , '1' will be 1
            }
        }
        return count;
    }

    public void convertMatrix(int[][] board) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                } else if (board[i][j] == -1) {
                    board[i][j] = 0;
                }
            }
        }
    }
}
