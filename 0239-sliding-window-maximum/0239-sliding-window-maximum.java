class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // solution using deque

        // make deque of size k
        //fill with the numbers and add elements in acending order
        // remove if last element is less than next element
        //greater elem will always in front
        // print max elem for last window
        //iterate till n for next windows
        //remove elements which are out of window
        //add element while checking greater element
        //print first number

        ArrayList<Integer> ans = new ArrayList();

        Deque<Integer> q = new ArrayDeque<Integer>();

        // iterate array till k to and add to deque
        // deque where we can add and remove element from the front and rear
        int i;
        for (i = 0; i < k; i++) {
            //check if next element is greater than the element which are in queue remove that

            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.removeLast();
            }

            q.addLast(i);
        }

        for (; i < nums.length; i++) {
            // this is the max element in the prev window
            ans.add(nums[q.peek()]);
            
            // remove useless element of prev window

            while (!q.isEmpty() && q.peek() <= i - k) {
                q.removeFirst();
            }
            //check if next element is greater than the element which are in queue remove that

            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.removeLast();
            }

            q.addLast(i);
        }
        // this is the max element in the current window
        ans.add(nums[q.peek()]);
        int[] optArray = new int[ans.size()];

        for (int j = 0; j < ans.size(); j++) {
            optArray[j] = ans.get(j);
        }
        return optArray;
    }
}
