class Solution {
    public int distributeCandies(int[] c) {
    
    HashSet<Integer> set=new HashSet<>();
   
    int limit=c.length/2;
    ArrayList<Integer> list=new ArrayList<>();
  HashMap<Integer,Integer> map=new HashMap<>();
  for(int i :c){
    map.put(i,map.getOrDefault(i,0)+1);
    
  }
  for(int i : map.keySet()){
    list.add(map.get(i));
  }
Collections.sort(list);
Collections.reverse(list);
int count=0;
for(int i : list){
    count++;
    if(count==limit){
        break;
    }
}

  System.out.print(list);
    return count;
    }
}