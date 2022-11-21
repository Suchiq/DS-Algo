class Solution {

    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;
        int j = 0;
        int max = 0;

        char[] str = s.toCharArray();
        
          if (str == null ||str.length == 0) {
            return 0;
        }
        
        Set<Character> set = new HashSet<>();

        while (i < str.length) {
            if (!set.contains(str[i])) {
                set.add(str[i]);

                if ((i - j + 1) > max) {
                    max = i - j + 1;
                }
                i++;
            } else {
                set.remove(str[j]);
                j++;
            }
        }
        return max;
    }
}
