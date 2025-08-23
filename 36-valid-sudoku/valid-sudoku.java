class Solution {
    public boolean isValidSudoku(char[][] board) {
    for(int i=0;i<9;i++){
        HashSet<Character> set=new HashSet<>();
        for(int j=0;j<9;j++){
           char c=board[i][j];
           if(c!='.'){
            if(set.contains(c)) {
                return false;
            }
            else{
                set.add(c);
            }
           }

        }
    }
    for(int i=0;i<9;i++){
        HashSet<Character> set=new HashSet<>();
        for(int j=0;j<9;j++){
           char c=board[j][i];
           if(c!='.'){
            if(set.contains(c)){
                return false;
            }
            else{
                set.add(c);
            }
           }
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            HashSet<Character> set=new HashSet<>();
            for(int k=i*3;k<i*3+3;k++){
                for(int l=j*3;l<j*3+3;l++){
                    char c=board[k][l];
                    if(c!='.'){
                    if(set.contains(c)){
                       return false;
                    }
                    else{
                        set.add(c);
                    }
                    }
                }
            }
        }
    }
    return true;
    }
}