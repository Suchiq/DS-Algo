class Solution {

    public String reverseWords(String s) {
        // to remove left and right space
        s = s.trim();

        String res = "";
        int start = 0;
        int end = 0;

        while (start < s.length() && end < s.length()) {
            while (s.charAt(start) == ' ') {
                start++;
            }
            end = start + 1;
            
            while (end < s.length() && (s.charAt(end) != ' ')) {
                end++;
            }

            String sub = s.substring(start, end);
            start = end;
            if (res.isEmpty()) {
                res = sub;
            } else {
                res = sub + " " + res;
            }
        }
        return res;
    }
}
