import java.util.*;
public class ques2{
  public static boolean searchmat(int[][] mat,int n,int m,int target){
    int l=0,r=n*m-1;
    while(l<=r){
      int mid=l+(r-l)/2;
      int row=mid/m;
      int col=mid%m;
      if(mat[row][col]==target){
        return true;
      }else if(mat[row][col]<target){
        l=mid+1;
      }else{
        r=mid-1;
      }
    }
    return false;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] mat=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        mat[i][j]=sc.nextInt();
      }
    }
    int target=sc.nextInt();
    if(searchmat(mat,n,m,target)){
      System.out.println("FOUND");
    }else{
      System.out.println("NOT FOUND");
    }
    sc.close();
  }
}