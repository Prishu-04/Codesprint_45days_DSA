import java.util.*;
public class ques1{
  static int n;
  static int[][] maze;
  static boolean[][] visited;
  static ArrayList<String> ans=new ArrayList<>();
  static int[] rowm={1,0,0,-1};
  static int[] colm={0,-1,1,0};
  static char[] direction={'D','L','R','U'};
  public static void findpath(int row,int col,String path){
    if(row==n-1 && col==n-1){
      ans.add(path);
      return;
    }
    visited[row][col]=true;
    for(int i=0;i<4;i++){
      int nrow=row+rowm[i];
      int ncol=col+colm[i];
      if(issafe(nrow,ncol)){
        findpath(nrow,ncol,path+direction[i]);
      }
    }
    visited[row][col]=false;
  }
  public static boolean issafe(int row,int col){
    return row>=0 && row<n && col>=0 && col<n && maze[row][col]==1 && !visited[row][col];   
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    maze=new int[n][n];
    visited= new boolean[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        maze[i][j]=sc.nextInt();
      }
    }
    if(maze[0][0]==0 || maze[n-1][n-1]==0){
      System.out.println(-1);
      return;
    }
    findpath(0,0,"");
    if(ans.size()==0){
      System.out.println(-1);
    }else{
      for(String path:ans){
        System.out.println(path);
      }
    }
  }
}
