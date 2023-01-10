class Solution {
    int row, col;
     int nonObstacleCount = 0;
     int count = 0;
     int res = 0;
     int start = 0;
     int end = 0;
    
    public int uniquePathsIII(int[][] grid) {
        
       
        // first find non obstacle cell count, cell which have 0

        // find starting point in the grid where cell contains 1

        // after finding strating point start path find proceess replace every visited path to -1
        // which will denote the visited

        // check if cell is target which is 2 and count is same as non obstacle then increase value of result

        // back track now and replace -1 to 0

        // track in 4 directions
        row = grid.length;
        col = grid[0].length;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                if(grid[i][j]==0 ){
                    nonObstacleCount++;
                }
                if(grid[i][j] == 1){
                    // need to count 1 also in non obstacle
                      nonObstacleCount++;
                      start = i;
                      end = j;
                    //starting point call find function 
                }
            }
        }
      
       findPath(grid, start ,end, 0);
        
      return res;
    }
    
        public void findPath(int[][] grid, int i, int j, int count){
            
            //System.out.println(nonObstacleCount+"");
            // negative scenerio
            
            if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == -1){
                return;
            }
            
            if(grid[i][j] == 2){
                
                if(nonObstacleCount == count){
                        res = res + 1;
                }
                return;
            }
            
            // mark visited 
            
            grid[i][j] = -1;
            
            // track in 4 directions 
            
            findPath(grid,i+1,j,count+1);
            findPath(grid,i,j+1,count+1);
            findPath(grid,i-1,j,count+1);
            findPath(grid,i,j-1,count+1);
            
              // update value back to the 0
              grid[i][j] = 0;
            
        }
}
