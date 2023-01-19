class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        // top down left right pointer
        // dir 0, 1 ,2 ,3
        //0 for left to right
        // 1 for right to bottom
        //2 for bottom to left
        // 3 bottom to top

        int row_start = 0;
        int row_end = matrix.length - 1;
        int col_start = 0;
        int col_end = matrix[0].length - 1;
        int dir = 0;
        List<Integer> list = new ArrayList<>();

        while (row_start <= row_end && col_start <= col_end) {
            
                //System.out.println(row_start);
                //System.out.println(row_end);
              //  System.out.println(col_start);
           
            if (dir == 0) {
                // print top to right

                for (int i = col_start; i <= col_end; i++) {
                    //System.out.println("ni");
                    list.add(matrix[row_start][i]);
                }
                row_start++;
                dir = 1;
            }
            else if (dir == 1) {
                // top to down

                for (int i = row_start; i <= row_end; i++) {
                    list.add(matrix[i][col_end]);
                }
                col_end--;
                dir = 2;
            }
           else if (dir == 2) {
                //right to left

                for (int i = col_end; i >= col_start; i--) {
                    list.add(matrix[row_end][i]);
                }
                row_end--;
                dir = 3;
            }
            else if (dir == 3) {
                //down to top
     

                for (int i = row_end; i >= row_start; i--) {
                    
                    //System.out.println(matrix[i][col_start]);
                    
                    list.add(matrix[i][col_start]);
                }
                col_start++;
                dir = 0;
            }
        }
        return list;
    }
}
