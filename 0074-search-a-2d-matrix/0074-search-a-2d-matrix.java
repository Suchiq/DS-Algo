class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int column = matrix[0].length - 1;

        int i = 0, j = matrix[0].length - 1;
        
        while (i <= row && j >= 0) {
                
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            }
        }
        return false;
    }
}
