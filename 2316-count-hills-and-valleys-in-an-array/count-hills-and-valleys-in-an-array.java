class Solution {
    public int countHillValley(int[] nums) {
        int prev = 0;
        int k = 1;
        while(k<nums.length){
            if(nums[k]!=nums[0]){
                break;
            }
            k++;
        }
        int i=k;
        int next = i+1;
        int count =0;
        while(i<nums.length-1){
            while(nums[next]== nums[i] && next<nums.length-1){
                next++;
            }
            if((nums[i]<nums[prev] && nums[i]<nums[next]) || (nums[i]>nums[prev] && nums[i]>nums[next])){
                count++;
            }
            i=next;
            next++;
            prev=i-1;
        }
        return count;
    }
}