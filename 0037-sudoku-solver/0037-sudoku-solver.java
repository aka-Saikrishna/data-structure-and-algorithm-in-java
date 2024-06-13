class Solution {
    public void solveSudoku(char[][] board) {
        int[][] f=new int[9][10];
        int[][] row=new int[9][10];
        int[][] col=new int[9][10];
        int cell=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
             cell=((i/3)*3)+j/3;
             if(board[i][j]!='.'){
             f[cell][(int)(board[i][j]-'0')]=1;
             row[i][(int)(board[i][j]-'0')]=1;
             col[j][(int)(board[i][j]-'0')]=1;
            }}
        }
        get(f,board,0,0,row,col);
        return;

    }
    static boolean get(int[][] f,char[][] board, int i, int j, int[][] row, int[][] col ){
        if(i==9)return true;
        if(board[i][j]!='.'){
            if(j==8){
                return get(f,board,i+1,0,row,col);
            }else{
                return get(f,board,i,j+1,row,col);
            }
        }else{
            boolean t=false;
            int cell=((i/3)*3) + j/3;
            for(int k=1;k<=9;k++){
                if(f[cell][k]==0 && row[i][k]==0 && col[j][k]==0){
                    f[cell][k]=1;
                    row[i][k]=1;
                    col[j][k]=1;
                    board[i][j]=(char) (k + '0');
                    if(j==8){
                        t=get(f,board,i+1,0,row,col);
                    }else{
                        t=get(f,board,i,j+1,row,col);
                    }
                    if(t)return true;
                    f[cell][k]=0;
                    row[i][k]=0;
                    col[j][k]=0;
                    board[i][j]='.';
                }
            }
        }
       return false;
    }

}