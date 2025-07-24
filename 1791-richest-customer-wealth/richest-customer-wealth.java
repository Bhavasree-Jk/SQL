class Solution {
    public int maximumWealth(int[][] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}