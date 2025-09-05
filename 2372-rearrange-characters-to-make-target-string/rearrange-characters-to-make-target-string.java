class Solution {
    public int rearrangeCharacters(String s, String t) {
    StringBuilder sb=new StringBuilder(s);  
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++){
        boolean val=false;
        for(int j=0;j<t.length();j++){

        if(s.charAt(i)==t.charAt(j)){
        
           val=true;
           break;
        }
        }
        if(val){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      
        }
        

    }

     HashMap<Character,Integer> map1=new HashMap<>();
    for(int i=0;i<t.length();i++){
        map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
   
      

    }


 if(map1.size()!=map.size()) return 0;
 
 int min=Integer.MAX_VALUE;
 for(char i :map.keySet()){
    min=Math.min(min,map.get(i)/map1.get(i));

 }
      
         return  min;
    }
}