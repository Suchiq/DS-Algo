class Solution {
    public boolean isPalindrome(String s) {
        char[] charA = s.toCharArray();

        int i = 0;
        int j = charA.length - 1;

        while (i < j) {

            if (!Character.isLetterOrDigit(charA[i])) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(charA[j])) {
                j--;
                continue;
            }

            if (Character.toLowerCase(charA[i]) == Character.toLowerCase(charA[j])) {
                i++;
                j--;

            } else {
                return false;
            }
        }
        return true;
    }

}