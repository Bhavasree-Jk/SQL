class Solution {
    public int[] shuffle(int[] nums, int n) {
     ArrayList<Integer> list1=new ArrayList<>();
      ArrayList<Integer> list2=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        if(i<n){
            list1.add(nums[i]);
        }
        else{
            list2.add(nums[i]);
        }
     }
    
      int[] arr=new int[nums.length]; 

      ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<list1.size();i++){
       list.add(list1.get(i));
        list.add(list2.get(i));
    
      }
      for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
      }
    
      return arr;
    }
}

     