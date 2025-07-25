class Solution {
    public int maxSum(int[] nums) {
        if(nums.length==1) return nums[0];
       LinkedHashSet<Integer> set=new LinkedHashSet<>();
       
       for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
       } 
       int max=Integer.MIN_VALUE;
       int sum=0;
       for(int i : set){
        if(i>0){
            sum+=i;

        }
        else{
            if(i>max){
                max=i;
               
            }
        }
         
       }
       if(sum==0)return max;
       return sum;
    }
}