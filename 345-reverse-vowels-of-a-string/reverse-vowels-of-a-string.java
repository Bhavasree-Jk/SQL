class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
     StringBuilder sb=new StringBuilder(s);
     while(left<right){
        char ch=s.charAt(left);
        char ch1=s.charAt(right);
        if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||
        ch=='i'||ch=='o'||ch=='u')){
         left++;

        }
        else if(!(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'|| ch1=='i'||ch1=='o'||ch1=='u')){
           right--;
        }
        else{
        sb.setCharAt(left,ch1);
        sb.setCharAt(right,ch);
        left++;
        right--;
     }
    }
    return sb.toString();
    }
}