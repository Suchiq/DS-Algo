class Solution {
    public int firstUniqChar(String s) {
        char[] ss =s.toCharArray();
    
        
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        
        for(int i=0;i<ss.length;i++){
    
            if(hs.containsKey(ss[i])){
                hs.put(ss[i],hs.get(ss[i])+1);
            }else{
                    hs.put(ss[i],1);
            }
        }
        
        for(int j=0;j<ss.length;j++){
            
            if(hs.get(ss[j])==1){
                return j;
            }
    }
            return -1;
}
}