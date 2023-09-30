class Solution {
    public void reverseString(char[] s) {
        
      //iterative
        
        int left = 0;
        int right = s.length -1;
        
      //  while(left<right){
            
         //   char temp = s[left];
        //    s[left] = s[right];
       //     s[right] = temp;
            
      //      left++;
     //       right--;
     //   }
        
        reverseRecursive(s,left,right);
    }
    
    public void reverseRecursive(char[] s, int left, int right){
        
        if(left>=right){
            return;
        }
           char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            reverseRecursive(s,left+1,right-1);
    }
   
}