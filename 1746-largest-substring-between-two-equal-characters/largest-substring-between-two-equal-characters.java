class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
    String str="";
ArrayList<Integer> list=new ArrayList<>();
   for(int i=0;i<s.length();i++){
    for(int j=i+1;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j)&&i!=j){
           list.add(Math.abs(i+1-j));
        }
    }
   }
   System.out.print(list);
   if(list.isEmpty()) return -1;
   int max=Integer.MIN_VALUE;
for(int i=0;i<list.size();i++){
    if(list.get(i)>max){
        max=list.get(i);
    }
}
   return max;
    }
}