class Solution {
    public List<List<Integer>> generate(int nums) {
        ArrayList<List<Integer>> list =new ArrayList<>();
        for(int i=0;i<nums;i++){
            ArrayList<Integer> list1=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list1.add(1);
                }
                else{
                    list1.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(list1);
        }
        return list;
        
    }
}