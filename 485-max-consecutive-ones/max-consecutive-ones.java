class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
      if(nums[i]!=0){
        count++;

      }
      if(nums[i]==0||i==nums.length-1){
        list.add(count);
        count=0;

      }
    }
    int max=0;
    for(int i=0;i<list.size();i++){
        if(list.get(i)>max){
            max=list.get(i);
        }
    }
    return max;
    }
}