class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
               min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int ans1=min+k;
        int ans2=max-k;
        int res=ans2-ans1;
     
        if(res<0){
            return 0;
        }
       return res; 
    }
}