import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    char ch='A';
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(j==i || j==n-i-1){
          System.out.print((char)(ch+i)+" ");
        }else{
          System.out.print("* ");
        }
      }
      System.out.print("\n");
    }
  }
}