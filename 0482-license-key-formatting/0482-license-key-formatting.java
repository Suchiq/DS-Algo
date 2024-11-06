class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        s = s.replace("-","").toUpperCase();
        
        String result = "";
        int count = 0;
        int i = s.length()-1;
        
        while(i>=0){
                      
                if(count<k)
                {
                    
                result = String.valueOf(s.charAt(i)).toUpperCase()+result ;
                count++;
                i--;
                    
                }else{
                    
                    result = "-"+result;
                    count = 0;
                }
                 
        }
        
        return result;
    }
}