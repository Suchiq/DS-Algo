class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        //row and column wise search

        // int row = matrix.length;
        //int i = 0;
        //int j = matrix[0].length - 1;

        // while (i < row && j >= 0) {
        //  if (matrix[i][j] == target) {
        //     return true;
        // } else if (matrix[i][j] > target) {
        //      j--;
        // } else {
        //     i++;
        // }
        //  }
        //  return false;

        //solution 2 -- binary search in matrix

        int row = matrix.length;
        int col = matrix[0].length;

        // totatal no of element in sorted matrix

        int total = (row * col) - 1;
        int low = 0;
        int high = total;

        while (low <= high) {
            int mid = (low + (high - low) / 2);

            if (matrix[mid / col][mid % col] == target) {
                return true;
            }

            if (matrix[mid / col][mid % col] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
