class Solution {
    public int[] twoSum(int[] nums, int t) {
     int left=0;
     int right=nums.length-1;
    
    int[] arr=new int[2];
     while(left<right){
        int sum=nums[left]+nums[right];
        if(sum==t){
          arr[0]=left+1;
          arr[1]=right+1;
          return arr;

        }
        else if(sum>t){
            right--;
        }
        else if(sum<t){
            left++;
        }
       
      
     }
     return arr;
    }
}