package ClassicalQuestions;

public class Ratinmaze {
    public static boolean isSafe(int maze[][],int x,int y ,boolean visited[][]){
        return x>=0 && x<maze.length&& y>=0&&y<maze.length && maze[x][y]==1 && !visited[x][y] ;
    }
    public static void ratinMaze(int maze[][],int x,int y,boolean visited[][],String path){
      if(x==maze.length-1 && y==maze[0].length-1){
    System.out.println( path);
    return;
}
visited[x][y]=true;
//down
if(isSafe(maze,x+1,y,visited)){
    ratinMaze(maze, x+1, y, visited, path+"D");
}
//up
   if(isSafe(maze,x-1,y,visited)){
    ratinMaze( maze, x-1, y, visited, path+"U");
   }
 //right
 if(isSafe(maze,x,y+1,visited)){
    ratinMaze(maze, x, y+1, visited, path);
 }
 //left
 if(isSafe(maze,x,y-1,visited)){
    ratinMaze(maze, x, y-1, visited, path);
 }
 visited[x][y]=false;
    }
    public static void main(String args[]){
        int maze[][]={{1,0,0,0},
                        {1,1,0,1},
{0,1,0,0},
{1,1,1,1}};
int n=maze.length;
boolean visited[][]=new boolean[n][n];
ratinMaze(maze, 0, 0, visited,"");

            }
}
