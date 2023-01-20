class Solution {

    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rowArr = new ArrayList<>();
        ArrayList<Integer> colArr = new ArrayList<>();

        // find out the row and colm index of 0

        //save in array

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    
                    rowArr.add(i);
                    colArr.add(j);
                }
            }
        }

        for (int i = 0; i < rowArr.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                matrix[rowArr.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < colArr.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                                   
                matrix[j][colArr.get(i)] = 0;
                
            }
        }
    }
}
