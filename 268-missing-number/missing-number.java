class Solution {
    public int missingNumber(int[] nums) {
    if(nums.length==1){
        if(nums[0]!=1){
            return 1;
        }
        else{
            return nums[0]-1;
        }
    }
        
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
        
        if(nums[i+1]!=nums[i]+1){
            return nums[i]+1;
        }
        if(nums[nums.length-1]!=nums.length){
            return nums.length;
        }
    }

return 0;
    }
}