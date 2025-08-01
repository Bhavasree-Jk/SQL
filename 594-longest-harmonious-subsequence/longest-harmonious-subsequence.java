class Solution {
    public int findLHS(int[] nums) {
        if(nums.length<=1) return 0;
    
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int max1=0;
       for(int i :map.keySet()){
        if(map.containsKey(i+1)){
            int max=map.get(i)+map.get(i+1);
            max1=Math.max(max,max1);
        }
       }
       return max1;
    }
}