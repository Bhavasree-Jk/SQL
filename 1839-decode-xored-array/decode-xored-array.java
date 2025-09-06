class Solution {
    public int[] decode(int[] e, int first) {
  int[] arr=new int[e.length+1];
  arr[0]=first;
    for(int i=0;i<e.length;i++){
      arr[i+1]=e[i]^arr[i];
    } 
    return arr;   
    }
}