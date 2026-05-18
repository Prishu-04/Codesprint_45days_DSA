import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N =");
    int n=sc.nextInt();
    System.out.print("Elements = ");
    int arr[]=new int[n];
    int c=0;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(arr[i]!=0){
        arr[c++]=arr[i];
      }
    }
    while(c<n){
      arr[c++]=0;
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
} 