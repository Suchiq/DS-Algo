class Solution {

    public int kthSmallest(int[][] matrix, int k) {
        //max heap of size 8

        int row = matrix.length;
        int col = matrix[0].length;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                pq.offer(matrix[i][j]);
                
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        return pq.poll();
    }
}
