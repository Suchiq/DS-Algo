class Solution {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        int j = 0;
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<>();
        
        while (i < charArray.length) {
            if (!set.contains(charArray[i])) {
                set.add(charArray[i]);
                i++;
                if (max < set.size()) {
                    max = set.size();
                }
            } else {
                set.remove(charArray[j]);
                j++;
                
            }
        }
        return max;
    }
}
