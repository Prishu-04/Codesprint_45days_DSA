import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    int[][] mat=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        mat[i][j]=sc.nextInt();
      }
    }
    char[][] result=new char[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(mat[i][j]==1){
          result[i][j]='O';
        }else{
          boolean disturbed=false;
          if(i>0 && mat[i-1][j]==1) disturbed=true;
          if(i<n-1 && mat[i+1][j]==1) disturbed=true;
          if(j>0 && mat[i][j-1]==1) disturbed=true;
          if(j<n-1 && mat[i][j+1]==1) disturbed=true;
          if(disturbed) result[i][j]='X';
          else result[i][j]='S';
        }
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(result[i][j]+" ");
      }
      System.out.println();
    }
  }
}