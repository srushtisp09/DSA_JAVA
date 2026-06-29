public class NKnights {
    static int n=8;
    public  static boolean isSafe(char board[][],int row,int col){
        int dx[]={-2,-2,-1,-1,+1,+1,+2,+2};
        int dy[]={-1,+1,-2,+2,-2,+2,-1,+1};
        for(int i=0;i<n;i++){
            int newRow=row+dx[i];
            int newCol=col+dy[i];
            if(newRow>=0 && newRow <board.length && 
                newCol>=0 && newCol<board.length && board[newRow][newCol]=='K'){
                   return false;
            }
        }
        return true;
    } 
    public static void NKNights(char board[][],int row,int col,int knights){
       if(knights==0){
        printBoard(board);
        return;
       }
        if(row==board.length){
             
            return ;
        }
        int nextRow=(col+1==board.length)? row +1: row;
        int nextCol=(col+1==board.length)? 0 : col +1;
        if(isSafe(board,row,col)){
            board[row][col]='K';
            NKNights(board,nextRow,nextCol,knights-1);
            board[row][col]='.';
           
        }
       NKNights(board,nextRow,nextCol,knights);


        
    }
    public static void printBoard(char board[][]){
        System.out.println("----Knight Board----");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.println(board[i][j]+" ");
                }
                System.out.println();
            }
        
    }

  public static void main(String args[]){
    int n=4;
    int knights=4;
    char board[][]=new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='.';
        }
    }
     NKNights(board,0,0,4);
  }

  
}
