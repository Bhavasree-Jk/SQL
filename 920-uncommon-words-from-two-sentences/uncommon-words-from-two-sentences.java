class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
     String[] str1=s1.split(" ");
      String[] str2=s2.split(" ");
      ArrayList<String> list=new ArrayList<>();
       for(int i=0;i<str1.length;i++){
        
      
            list.add(str1[i]);
          
        }
         for(int i=0;i<str2.length;i++){
        
      
            list.add(str2[i]);
          
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String i : list){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       
        ArrayList<String> ans=new ArrayList<>();

       for(String i :map.keySet()){
        if(map.get(i)==1){
            ans.add(i);
        }
       }
        String[] s=new String[ans.size()];
      for(int i=0;i<s.length;i++){
         s[i]=ans.get(i);
      }
      return s;
    }
}
      