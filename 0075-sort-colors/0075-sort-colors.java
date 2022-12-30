class Solution {

    public void sortColors(int[] nums) {
        int l_pointer = 0;
        int m_pointer = 0;
        int r_pointer = nums.length - 1;

        while (m_pointer <= r_pointer) {
            if (nums[m_pointer] == 0) {
                int temp = nums[m_pointer];
                nums[m_pointer] = nums[l_pointer];
                nums[l_pointer] = temp;
                l_pointer++;
                m_pointer++;
            } else if (nums[m_pointer] == 1) {
                m_pointer++;
            } else if (nums[m_pointer] == 2) {
                int temp = nums[m_pointer];
                nums[m_pointer] = nums[r_pointer];
                nums[r_pointer] = temp;
                r_pointer--;
            }
        }
    }
}
