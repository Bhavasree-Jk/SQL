class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
     
     for(int i=0;i<words.length;i++){
         boolean val=true;
        for(int j=0;j<words[i].length();j++){
           
            
          
                if(!allowed.contains(words[i].charAt(j)+"")){
                 val=false;
                 break;
                }
            }
          if(val){
            count++;
          }
        }
     
     return count;  
    }
}