import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      arr[i]=arr[i]*arr[i];
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]);
    }
    Arrays.sort(arr);
  }
}