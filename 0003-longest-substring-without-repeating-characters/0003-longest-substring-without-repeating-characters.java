class Solution {
    public int lengthOfLongestSubstring(String s) {
      
         char[] optS = s.toCharArray();
         int count =0;
         int length =0;
         int i=0;
         HashMap<Character,Integer>map=new HashMap<>();
        
         while(!s.isEmpty()&&i<optS.length){
            if(!map.containsKey(optS[i])){
               map.put(optS[i],count++);
             i++;
           }else
           {
                i=i-map.size()+1;
               if(length<map.size())
               {
                length = map.size();
               
               }
              count =0;
              map.clear();
           } 
         }
        if(length<map.size())
        {
            length = map.size();
        }
       return length;
    }
}