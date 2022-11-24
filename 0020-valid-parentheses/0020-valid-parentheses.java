class Solution {

    public boolean isValid(String str) {
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray.length % 2 != 0) {
                return false;
            }
            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[') {
                stack.push(charArray[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if ((charArray[i] == ')' && stack.peek() == '(') || (charArray[i] == '}' && stack.peek() == '{') || (charArray[i] == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    stack.push(charArray[i]);
                }
            }
        }
        return stack.isEmpty();
    }
}
