class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        //sliding window size

        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> resList = new ArrayList<>();
        int k = p.length();

        //make sliding window of k size

        for (int i = 0; i < k; i++) {
            //save pattern in hasmap with count frequency
            if (map.containsKey(p.charAt(i))) {
                map.put(p.charAt(i), map.get(p.charAt(i)) + 1);
            } else {
                map.put(p.charAt(i), 1);
            }
        }
        int i = 0;
        int j = 0;
        int UniqInMap = map.size();

        while (j < s.length()) {
            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                // minus frequency of that ch in the map because we have found that
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    UniqInMap--;
                }
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                //window hit record calulation

                if (UniqInMap == 0) {
                    //means anagarm found in that window

                    resList.add(i);
                }
                //remove prev from window add new char to window

                char prev = s.charAt(i);

                if (map.containsKey(prev)) {
                    map.put(prev, map.get(prev) + 1);

                    if (map.get(prev) == 1) {
                        UniqInMap++;
                    }
                }

                i++;
                j++;
            }
        }
        return resList;
    }
}
