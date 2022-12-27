class Solution {

    public int orangesRotting(int[][] grid) {
        // find out the fresh orange count
        // push rotton apple into queue

        int row = grid.length;
        int column = grid[0].length;
        int freshCount = 0;
        int step = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                }
                if (grid[i][j] == 2) {
                    queue.add(new int[] { i, j });
                }
            }
        }

        // four directions

        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        while (!queue.isEmpty() && freshCount > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll(); //{0,0}

                for (int j = 0; j < directions.length; j++) {
                    int[] dir = directions[j];
                    int nextX = curr[0] + dir[0];
                    int nextY = curr[1] + dir[1];

                    if (nextX < 0 || nextY < 0 || nextX >= row || nextY >= column || grid[nextX][nextY] != 1) {
                        continue;
                    }
                    queue.add(new int[] { nextX, nextY });
                    grid[nextX][nextY] = 2;
                    freshCount--;
                }
            }
            step++;
        }
        return freshCount == 0 ? step : -1;
    }
}
