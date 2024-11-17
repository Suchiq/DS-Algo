class Solution {
    public String reverseWords(String s) {
        
        char[] str = s.toCharArray();

        int startPointer = 0;

        int endPointer = 0;

        while (endPointer <= str.length) {

          if (endPointer == str.length || str[endPointer] == ' ') {
              
            reverseChar(startPointer, endPointer - 1,str);
            startPointer = endPointer+1;
          } 

          endPointer++;

        }
        return new String(str);
    }
    
    public char[] reverseChar(int start, int end, char[] array){
                
        while(start<end){
            
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            start++;
            end--;
        }
           return array;
    }
 
}