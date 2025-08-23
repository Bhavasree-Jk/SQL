class Solution {
    public int findLengthOfLCIS(int[] nums) {
   // Arrays.sort(nums);
    int count=1;
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<nums.length-1;i++){
       

       if(nums[i]<nums[i+1]){
      
        count++;
        
       }
       
       else{
        list.add(count);
       
        count=1;
       }

    } 
    list.add(count);
  if(list.isEmpty()){
    return nums.length;
  }
  System.out.print(list);
   int max=0;
   for(int i=0;i<list.size();i++){
    if(list.get(i)>max){
        max=list.get(i);
    }
   }
    return max;  
    }
}