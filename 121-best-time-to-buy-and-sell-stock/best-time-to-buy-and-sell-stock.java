class Solution {
    public int maxProfit(int[] arr) {
    
    int val=0;
    int r=0;
    int max=0;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
      else if(arr[i]-min>max){
        max=arr[i]-min;
      }
       
    }
    return max;
    }
}     