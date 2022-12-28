class Solution {

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack();
        int n = nums.length;
        int[] ansArray = new int[n];
        Arrays.fill(ansArray, -1);

        for (int i = 0; i < 2 * n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ansArray[stack.pop()] = nums[i % n];
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return ansArray;
    }
}
