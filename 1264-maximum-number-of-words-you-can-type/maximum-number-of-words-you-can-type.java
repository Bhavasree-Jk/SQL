class Solution {
    public int canBeTypedWords(String t, String b) {
        String[] s=t.split(" ");
        int count=0;
        for(int i=0;i<s.length;i++){
            boolean val=true;
           for(int j=0;j<s[i].length();j++){
            if(b.contains(s[i].charAt(j)+"")){
                val=false;
                break;
            }
           }
           if(val){
            count++;
           }
        }
        return count;
    }
}