class Solution {

    public void solve(char[][] board) {
        //iterate boundary elements convert all connected 0 to 1
        //because thoese will be invalid as o should be covered with x in 4 directions
        //00, 01,02,03
        //10        13
        //20        23
        // 30. 31 32 33

        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') {
                //call visited
              System.out.println("0"+" "+i);

                markVisitedZero(board, 0, i);
            }
        }

        for (int i = 0; i < board.length; i++) {
            
            if (board[i][board[0].length - 1] == 'O') {
                
              System.out.println(i+" "+(board[0].length - 1));
                
                //call visited
                markVisitedZero(board, i, board[0].length - 1);
            }
        }
        for (int i = 0; i < board[0].length; i++) {
        
            if (board[board.length - 1][i] == 'O') {
                //call visited
                 System.out.println(board.length - 1+" "+i);

                markVisitedZero(board, board.length - 1, i);
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                 System.out.println(i+" "+0);
                
                //call visited
                markVisitedZero(board, i, 0);
            }
        }

        // traverse complete matrix convert 1 to 0 and remaining 0 to 1 because thoes are valid

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '1') {
                    board[i][j] = 'O';
                    
                }else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void markVisitedZero(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return;
        }
        
        if (board[i][j] == 'X'||board[i][j] == '1') {
            return;
        }
        //mark visited
        board[i][j] = '1';
      // System.out.println(board[i][j]);
         
        markVisitedZero(board, i + 1, j);
        markVisitedZero(board, i, j + 1);
        markVisitedZero(board, i - 1, j);
        markVisitedZero(board, i, j - 1);
    }
}
