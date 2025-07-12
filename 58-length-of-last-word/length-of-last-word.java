class Solution {
    public int lengthOfLastWord(String s) {
       String[] split=s.split(" ");
       String ans=split[split.length-1];
       return ans.length();
        
    }
}