class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();

    
    for(int i=0;i<items.size();i++){
    
            list1.add(items.get(i).get(0));
            }
             for(int i=0;i<items.size();i++){
    
            list2.add(items.get(i).get(1));
            }
             for(int i=0;i<items.size();i++){
    
            list3.add(items.get(i).get(2));
            }
          
    

    int count=0;
    if(ruleKey.equals("type")){
         for(int i=0;i<list1.size();i++ ){

            if(list1.get(i).equals(ruleValue)){
                count++;
            }
         }
    }
    else if(ruleKey.equals("color")){
          for(int i=0;i<list2.size();i++ ){

            if(list2.get(i).equals(ruleValue)){
                count++;
            }
         }

    }
    else{
      for(int i=0;i<list3.size();i++ ){

            if(list3.get(i).equals(ruleValue)){
                count++;
            }
         }
    }
    
    
    return count;
    }
}