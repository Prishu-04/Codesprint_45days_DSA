import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    System.out.print("X = ");
    int x=sc.nextInt();
    int sum=0;
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int j;
    for(j=0;j<n;j++){
      sum=sum+arr[j];
      if(sum>x){
        System.out.println(j);
        break;
      }
    }
    if(sum<x){
      System.out.println("-1");
    }
  }
}