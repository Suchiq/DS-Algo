class Solution {

    public boolean isPalindrome(int x) {
        String[] str = String.valueOf(x).split("");

        int i = 0;
        int j = str.length - 1;

        while (i <= j) {
            if (!str[i].equals(str[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
