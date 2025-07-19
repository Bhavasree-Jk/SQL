class Solution {
    public int maxProduct(int[] nums) {
    int pro=nums[0];
    int p=1;
    int s=1;
    int max=0;
    for(int i=0;i<nums.length;i++){
        if(p==0) p=1;
        if(s==0) s=1;
        p*=nums[i];
        s*=nums[nums.length-i-1];
        pro=Math.max(pro,Math.max(p,s));


    }
    return pro;
    }
}