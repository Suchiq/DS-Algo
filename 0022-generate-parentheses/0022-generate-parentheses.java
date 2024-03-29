class Solution {
    private List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        int open = 0, close = 0;
        String s = "";
        addParenthesis(open, close, s, n);
        return ans;
    }

    void addParenthesis(int open, int close, String s, int n) {
        if (open == n && close == n) {
            ans.add(s);
            return;
        }

        if (open < n) {
            addParenthesis(open + 1, close, s + "(", n);
        }

        if (close < open) {
            addParenthesis(open, close + 1, s + ")", n);
        }
    }
}
