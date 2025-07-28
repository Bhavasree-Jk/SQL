class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)return true;
    
        if(word.equals(word.toUpperCase())){
            return true;
        }
         if(word.equals(word.toLowerCase())){
            return true;
        }
    char s=word.charAt(0);
    boolean val1=true;
    boolean val2=true;
    if(!Character.isUpperCase(s)){
     val1=false;
    }
    for(int i=1;i<word.length();i++){
        if(!Character.isLowerCase(word.charAt(i))){
              val2=false;
        }
    }
    if(val1&&val2)return true;
       
        int count1=0;
        int count2=0;
        for(int i=0;i<word.length();i++){
        if(i==0){
         if(Character.isUpperCase(word.charAt(i))){
          continue;
         }
         else{
            return false;
         }
        }
        else if(i>0){
            if(Character.isLowerCase(word.charAt(i))){
                return false;
            }

           
        }
        }
      
   

      
      
        
    return false;
        
    }
}