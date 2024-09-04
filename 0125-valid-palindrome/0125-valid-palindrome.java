  class Solution {
    public boolean isPalindrome(String s) {

        String fixedString = "";
         
         for(int i =0; i< s.length();i++){
           if(isAlphanumeric(s.charAt(i))){
             fixedString = fixedString + s.charAt(i);
           }
         }

         fixedString = fixedString.toLowerCase(); 
         int i =0;
         int j = fixedString.length()-1;

         while(i<=j){
            if(fixedString.charAt(i)!=fixedString.charAt(j)){
                
                return false;
            }
             i++;
             j--;
         }
        return true;
    }

    public boolean isAlphanumeric(Character ch){
        if(Character.isLetterOrDigit(ch)){
            return true;
        }
        return false;
    }
}