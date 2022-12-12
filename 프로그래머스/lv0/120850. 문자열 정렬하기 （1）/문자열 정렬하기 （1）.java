import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> arr=new ArrayList<Integer>();    
        
      for(int i=0; i<my_string.length(); i++) {
          if(Pattern.matches("[0-9]+", my_string.substring(i, i+1))) { 
              arr.add(Integer.parseInt(my_string.substring(i, i+1)));   
          }
      }
      Collections.sort(arr);
      return arr;
      }
}
