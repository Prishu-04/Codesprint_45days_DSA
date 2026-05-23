import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int sumd1=0,sumd2=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i==j){
          sumd1+=arr[i][j];
        }
        if(j==(n-i-1)){
          sumd2+=arr[i][j];
        }
      }
    }
    if(sumd1==sumd2){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}