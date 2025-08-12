class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans=new int[s.length()];
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                ls.add(i);
            }
        }
        
        for(int i=0;i<s.length();i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<ls.size();j++){
                int res=Math.abs(i-ls.get(j));
                if(min>res){
                    min=res;
                }
            }
            ans[i]=min;
        }
        return ans;
    }
}