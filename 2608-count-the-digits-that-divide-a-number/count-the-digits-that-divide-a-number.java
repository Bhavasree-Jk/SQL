class Solution {
    public int countDigits(int num) {
        int temp=num;
     int c=0;
     while(num!=0){
        int digit=num%10;
        if(temp%digit==0){
            c++;
        }
        num=num/10;
     } 
     return c;  
    }
}