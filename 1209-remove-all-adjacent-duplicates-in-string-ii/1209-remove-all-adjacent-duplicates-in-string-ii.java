class Solution {

    public String removeDuplicates(String s, int k) {
        // take stack add values in pair

        Stack<Pair> stack = new Stack<Pair>();

        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().getKey() == c) {
                Pair<Character, Integer> pair = stack.peek();

                if (pair.getValue() == k - 1) {
                    stack.pop();
                } else {
                    stack.pop();
                    int value = pair.getValue();
                    value = value + 1;
                    stack.push(new Pair(c, value));
                }
            } else {
                stack.push(new Pair(c, 1));
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            Pair<Character, Integer> pair = stack.pop();

            for (int i = 0; i < pair.getValue(); i++) {
                sb.append(pair.getKey());
            }
        }

        return sb.reverse().toString();
    }
}
