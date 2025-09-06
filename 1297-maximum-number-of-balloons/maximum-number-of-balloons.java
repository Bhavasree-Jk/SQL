class Solution {
    public int maxNumberOfBalloons(String t) {
        if(t.length()<7){
            return 0;
        }
         HashMap<Character,Integer> map1=new HashMap<>();
         String s="balloon";
    for(int i=0;i<s.length();i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
    }
   
   
    HashMap<Character,Integer> map2=new HashMap<>();
    for(int i=0;i<t.length();i++){
        boolean val=false;
        for(int j=0;j<s.length();j++){
               if(s.charAt(j)==t.charAt(i)){
                val=true;
               }
        }
        if(val){
        map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

    }
  
if(map1.size()!=map2.size()) return 0;

int min=Integer.MAX_VALUE;

for(char c:map1.keySet()){
min=Math.min(min,map2.get(c)/map1.get(c));
 
 
}

    return min;
    }
}