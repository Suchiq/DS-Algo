class Solution {

    public String tictactoe(int[][] moves) {
        // moves length
        int n = moves.length;
        // create grid

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        //fil matrix with moves

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                board[moves[i][0]][moves[i][1]] = 'x';
            } else {
                board[moves[i][0]][moves[i][1]] = '0';
            }
        }
        // print matrix

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        return checkBoard(board);
    }

    public String checkBoard(char[][] board) {
        // check all column

        for (int i = 0; i < 3; i++) {
            int countA = 0;
            int countB = 0;

            for (int j = 0; j < 3; j++) {
                if (board[j][i] == 'x') {
                    countA++;
                }
                if (board[j][i] == '0') {
                    countB++;
                }
            }

            if (countA == 3) {
                return "A";
            }
            if (countB == 3) {
                return "B";
            }
        }
        // check all rows

        for (int i = 0; i < 3; i++) {
            int countA = 0;
            int countB = 0;

            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'x') {
                    countA++;
                }
                if (board[i][j] == '0') {
                    countB++;
                }
            }

            if (countA == 3) {
                return "A";
            }
            if (countB == 3) {
                return "B";
            }
        }
        // check diagonal

        if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') {
            return "A";
        }

        if (board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0') {
            return "B";
        }
        
         if (board[2][0] == 'x' && board[1][1] == 'x' && board[0][2] == 'x') {
            return "A";
        }

        if (board[2][0] == '0' && board[1][1] == '0' && board[0][2] == '0') {
            return "B";
        }
        
        // check for pending 
        int count = 0;
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                
                if(board[i][j]=='x'||board[i][j]=='0'){
                    count++;
                }
            }
        }
         if(count!=9){
             return "Pending";
         }
        return "Draw";
    }
}
