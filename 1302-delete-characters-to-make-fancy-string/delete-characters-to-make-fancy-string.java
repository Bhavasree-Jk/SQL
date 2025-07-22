class Solution {
    public String makeFancyString(String s) {
      StringBuilder sb=new StringBuilder(s);
      int i=0;
     while(i<sb.length()-2){
        if((sb.charAt(i)==sb.charAt(i+1))&&(sb.charAt(i+1)==sb.charAt(i+2))){
            sb.deleteCharAt(i);
        }
        else{
            i++;
        }
       
      }
      return sb.toString();
    }
}