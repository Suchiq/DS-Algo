class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // solution using de queue

        // make deque of size k
        //fill with the numbers and add elements which acending order
        // remove if last element is less than next element
        //greater elem will always in front
        // print greater elem for last window
        //iterate till n for next windows
        //remove elements which are out of window
        //add element while checking greater element
        //print first number

        ArrayList<Integer> ans = new ArrayList();

        Deque<Integer> arrDequeue = new ArrayDeque<Integer>();

        // iterate array till k to and add to deque
        // deque where we can add and remove element from the front and rear
        int i;
        for (i = 0; i < k; i++) {
            //check if next element is greater than the element which are in queue remove that

            while (!arrDequeue.isEmpty() && nums[i] >= nums[arrDequeue.peekLast()]) {
                arrDequeue.removeLast();
            }

            arrDequeue.addLast(i);
        }

        //System.out.println(i);

        for (; i < nums.length; i++) {
            // this is the max element in the prev window
            ans.add(nums[arrDequeue.peek()]);

            // remove useless element of prev window

            while (!arrDequeue.isEmpty() && arrDequeue.peek() <= i - k) {
                arrDequeue.removeFirst();
            }
            //check if next element is greater than the element which are in queue remove that

            while (!arrDequeue.isEmpty() && nums[i] >= nums[arrDequeue.peekLast()]) {
                arrDequeue.removeLast();
            }

            arrDequeue.addLast(i);
        }
        // this is the max element in the current window
        ans.add(nums[arrDequeue.peek()]);
        int[] optArray = new int[ans.size()];

        for (int j = 0; j < ans.size(); j++) {
            optArray[j] = ans.get(j);
        }
        return optArray;
    }
}
