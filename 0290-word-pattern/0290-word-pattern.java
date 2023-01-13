class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        if (pattern.length() != strArr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(strArr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(strArr[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), strArr[i]);
            }
        }

        return true;
    }
}
