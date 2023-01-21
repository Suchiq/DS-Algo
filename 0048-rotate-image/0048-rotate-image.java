class Solution {

    public void rotate(int[][] matrix) {
        // first transpose the matrix
        // reverse the matrix
        // time complexity O(n2)
        // space compexity O(1)

        transposeMatrix(matrix);
        reverseMatrix(matrix);
    }

    public void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reverseMatrix(int[][] matrix) {
        // reverse every row

        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix.length-1;

            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
