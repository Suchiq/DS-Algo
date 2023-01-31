class Solution {
    int res = 0;

    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        // dynamic programming

        //recurssion
        // return findPath(0, 0, m, n, grid);
        return findPathDp(m, n, grid);
    }

    public int findPathDp(int m, int n, int[][] grid) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    grid[i][j] = 1;
                } else {
                    grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
                }
            }
        }

        return grid[m - 1][n - 1];
    }

    public int findPath(int i, int j, int m, int n, int[][] grid) {
        //System.out.println(i + " " + j);

        if (i >= m || j >= n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        return (findPath(i, j + 1, m, n, grid) + findPath(i + 1, j, m, n, grid));
    }
}
