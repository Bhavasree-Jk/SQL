class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
    
    boolean[] val=new boolean[b.length];
    int count=0;
   for(int i=0;i<f.length;i++){
    boolean vals=false;
    for(int j=0;j<b.length;j++){
        if(!val[j]&&b[j]>=f[i]){
            val[j]=true;
            vals=true;
            break;
        }
    }
    if(vals){
        count++;
    }
   }
   if(count==f.length) return 0;
   return f.length-count;
    }
}