import java.math.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String s="";
        ArrayList<Integer> list=new ArrayList<>();
        for(int i : num){
            s+=i+"";
        }
        String s1=k+"";
        BigInteger a=new BigInteger(s);
        BigInteger c=new BigInteger(s1);
        BigInteger ans= a.add(c);
       String res=ans.toString();
       for(int i=0;i<res.length();i++){
        int b=(int)res.charAt(i);
        list.add(b-48);
       }
      return list;  
    }
}