class Solution {
    public String largestGoodInteger(String s) {
        ArrayList<Character> list=new ArrayList<>();
       for(int i=0;i<=s.length()-3;i++){
        if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2)){
            list.add(s.charAt(i));

        }
       } 
       if(list.isEmpty()) return "";
       int max=0;
       for(int i=0;i<list.size();i++){
        int a=(int)(list.get(i));
        if(a>max){
            max=a;
        }
       }

         
     String r="";
     int n=1;
     while(n<=3){
        r+=max-48+"";
        n++;
     }
       return r;
    }
}