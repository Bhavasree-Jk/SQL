class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
    for(int i :nums)  {
        sum1+=i;
    }
    int sum2=0;
    for(int i=0;i<nums.length;i++){
        while(nums[i]!=0){
          int digit=nums[i]%10;
          sum2+=digit;
          nums[i]=nums[i]/10;

        }
    }
        return Math.abs(sum1-sum2);
    }
}