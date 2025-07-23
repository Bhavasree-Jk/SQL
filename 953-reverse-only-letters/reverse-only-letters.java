class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder(s);
      int left=0;
 int right=s.length()-1;
while(left<right){
    char ch=s.charAt(left);
    char ch1=s.charAt(right);
    if((Character.isLetter(ch))&&(Character.isLetter(ch1))){
        sb.setCharAt(left,ch1);
         sb.setCharAt(right,ch);
         left++;
         right--;
         
    }
    else if(!Character.isLetter(ch)){
        left++;
    }
      else if(!Character.isLetter(ch1)){
        right--;
    }
   

}
return sb.toString();
    }
}