class Solution {
    public int countCharacters(String[] words, String chars) {
   
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<chars.length();i++){
          char c=chars.charAt(i);
          map1.put(c,map1.getOrDefault(c,0)+1);
        }

       
    
       int sum=0;
        for(int i=0;i<words.length;i++){
              HashMap<Character,Integer> map2=new HashMap<>();
             for(int j=0;j<words[i].length();j++){
                 char c=words[i].charAt(j);
                 map2.put(c,map2.getOrDefault(c,0)+1);
             }
             boolean val=true;
          for(char c: map2.keySet()){
            if(map2.get(c)>map1.getOrDefault(c,0)){
                 val=false;
            }
          }
          if(val){
            sum+=words[i].length();
          }
             
             }
        
     
     return sum;
    }
}