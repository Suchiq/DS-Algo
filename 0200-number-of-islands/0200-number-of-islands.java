class Solution {
    int res = 0;

    public int numIslands(char[][] grid) {
        // find first 1
        // add result in values
        // mark that guy visited
        //traverse in 4 directions
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                //System.out.println(i+" "+j);
               // System.out.println(col);

                if (grid[i][j] == '1') {
                    res = res + 1;
                    checkForFourDir(i, j, grid, row, col);
                }
            }
        }
        return res;
    }

    public void checkForFourDir(int i, int j, char[][] grid, int row, int col) {
        if (i < 0 || i >= row || j < 0 || j >= col) {
            return;
        }

        if (grid[i][j] == '$' || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '$';

        checkForFourDir(i, j + 1, grid, row, col);
        checkForFourDir(i + 1, j, grid, row, col);
        checkForFourDir(i - 1, j, grid, row, col);
        checkForFourDir(i, j - 1, grid, row, col);
    }
}
