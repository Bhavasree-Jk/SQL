class Solution {
    public int lastStoneWeight(int[] s) {
    ArrayList<Integer> list=new ArrayList<>();
    for(int i : s){
        list.add(i);
    }
    if(list.size()==2){
    int res=Math.abs(list.get(0)-list.get(1));
    return res;
   }
  
  while(list.size()>2){
      Collections.sort(list);
     
    int a=list.get(list.size()-1);
    int b=list.get(list.size()-2);
   
    if(a==b){
        list.remove((list.size()-1));
        list.remove((list.size()-1));


    }
    else if(a!=b){
         list.remove((list.size()-1));
        list.remove((list.size()-1));
        list.add(a-b);
    }
  }
   if(list.size()==2){
    int res=Math.abs(list.get(0)-list.get(1));
    return res;
   }
  
    return list.get(0);
    }
}