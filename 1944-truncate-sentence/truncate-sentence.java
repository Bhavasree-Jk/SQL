class Solution {
    public String truncateSentence(String s, int k) {
    String[] split=s.split(" ");
    String str="";
    for(int i=0;i<k;i++){
     str+=split[i]+" ";
    } 
    return str.trim();   
    }
}