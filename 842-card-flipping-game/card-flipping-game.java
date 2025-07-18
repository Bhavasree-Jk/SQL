class Solution {
    public int flipgame(int[] f, int[] b) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<f.length;i++){
            list.add(f[i]);
        }
        for(int j=0;j<b.length;j++){
            list.add(b[j]);
        }
     HashSet<Integer> set=new HashSet<>();
     for(int i=0;i<f.length;i++){
        if(f[i]==b[i]) set.add(f[i]);
     }
    
     
         ArrayList<Integer> list1=new ArrayList<>();
         for(int i :list ){
            if(!set.contains(i)){
                list1.add(i);
            }
         }
      if(list1.isEmpty()) return 0;
    int min=Integer.MAX_VALUE;
    for(int  i=0;i<list1.size();i++){
        if(list1.get(i)<min){
            min=list1.get(i);
        }
    }
    return min; 
    }
}
       