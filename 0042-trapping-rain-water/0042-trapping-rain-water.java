class Solution {

    public int trap(int[] height) {
        int length = height.length;
        int ans = 0;
        int[] left = new int[length];
        int[] right = new int[length];

        left[0] = height[0];

        for (int i = 0; i < length - 1; i++) {
            left[i + 1] = Math.max(left[i], height[i + 1]);
        }

        right[length - 1] = height[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        for (int i = 0; i < length; i++) {
            ans = ans + Math.min(left[i], right[i]) - height[i];
        }
        return ans;
    }
}
