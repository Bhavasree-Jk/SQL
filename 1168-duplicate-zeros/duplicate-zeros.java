class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
              list.add(arr[i]);
              list.add(arr[i]);

                
            }
            else{
                list.add(arr[i]);
            }
        }
       int[] n=new int[arr.length];
       for(int i=0;i<n.length;i++){
        n[i]=list.get(i);
      
       
       }
     for(int i=0;i<n.length;i++){
        arr[i]=n[i];
     }
    }
}