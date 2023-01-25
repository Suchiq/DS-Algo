//class Solution {

//public int kthSmallest(int[][] matrix, int k) {
//max heap of size 8

//int row = matrix.length;
// int col = matrix[0].length;

//  PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

// for (int i = 0; i < row; i++) {
//     for (int j = 0; j < col; j++) {

//       pq.offer(matrix[i][j]);

//       if (pq.size() > k) {
//       pq.poll();
//       }
//  }
// }

//  return pq.poll();

class Solution {
    int row = 0;
    int col = 0;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    Set<String> visitedSet = new HashSet<>();

    public int kthSmallest(int[][] matrix, int k) {
        //start with 00 index
        //move right and bottom because big element can found there only
        //mark visited so that not end up with same element
        //take max heap which is sorted max elemet will be on top
        row = matrix.length;
        col = matrix[0].length;

        int count = 1;
        int i = 0;
        int j = 0;

       // maxHeap.add(matrix[i][j]);

        markVisited(matrix, i, j);
        
        System.out.println(row*col);
        
        System.out.println(visitedSet.size());
        
        System.out.println(maxHeap.size());

        while (k < maxHeap.size()) {
            //System.out.println(maxHeap.peek());
            
            maxHeap.poll();
        }

        return maxHeap.poll();
    }

    public void markVisited(int[][] matrix, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || visitedSet.contains(i + "#" + j)) {
            return;
        }

        visitedSet.add(i + "#" + j);
        maxHeap.add(matrix[i][j]);

        markVisited(matrix, i, j + 1);
        markVisited(matrix, i + 1, j);
        markVisited(matrix, i - 1, j);
        markVisited(matrix, i, j - 1);
    }
}
//}
//}
