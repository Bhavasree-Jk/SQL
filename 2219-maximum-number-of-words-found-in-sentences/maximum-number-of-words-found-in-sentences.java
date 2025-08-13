class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
   for(int i=0;i<s.length;i++){
     for(int j=0;j<s[i].length();j++){
        String[] split=s[i].split(" ");
       if(split.length>max){
        max=split.length;
       }
     }
   }
   return max;
    }
}