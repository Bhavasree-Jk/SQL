class Solution {
    public List<List<Integer>> generate(int nums) {
        ArrayList<List<Integer>> tri=new ArrayList<>();
    for(int i=0;i<nums;i++){
     ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0||j==i){
                list.add(1);
            }
            else{
                int ans=tri.get(i-1).get(j-1)+tri.get(i-1).get(j);
               list.add(ans);
            }

        }
        tri.add(list);
        
    }
    return tri;
        
    }
}