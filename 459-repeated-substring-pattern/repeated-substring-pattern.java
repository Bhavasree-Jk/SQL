class Solution {
    public boolean repeatedSubstringPattern(String s) {
    String str=s+s;
    String res="";
    for(int i=1;i<str.length()-1;i++){
          res+=str.charAt(i);
    }
  //  System.out.print(res);
 if(res.contains(s)){
    return true;

 }
 return false;
}
}