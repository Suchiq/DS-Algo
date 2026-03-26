class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        //sort the coming string and add as a key in the hashmap 
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str:strs){

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String key = new String(charArray);

            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                  map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
