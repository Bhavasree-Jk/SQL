class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            sum=0;
            for(int j=0;j<list2.length;j++){
            if(list1[i].equals(list2[j])){
                sum=i+j;
                map.put(list1[i],sum);
            }
            }
        }
      for(String i :map.keySet()){
        if(map.get(i)<min){
            min=map.get(i);
        }
      }
    ArrayList<String> list=new ArrayList<>();
     
     for(String i :map.keySet()){
        if(map.get(i)==min){
            list.add(i);

        }
     }
   
         String[] s=new String[list.size()];  
         for(int i=0;i<list.size();i++){
            s[i]=list.get(i);
         }
        return s;
        
    }
}