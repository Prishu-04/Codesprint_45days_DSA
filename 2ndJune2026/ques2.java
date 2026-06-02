import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int x=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    long sum=0;
    int zerocount=0;
    for(int i=0;i<n;i++){
      sum+=arr[i];
      if(arr[i]==0){
        zerocount++;
      }
    }
    if(sum>=x && zerocount==0){
      System.out.println("YES");
      return;
    }
    for(int i=k;i<n;i++){
      sum-=arr[i-k];
      if(arr[i-k]==0){
        zerocount--;
      }
      sum+=arr[i];
      if(arr[i]==0){
        zerocount++;
      }
      if(sum>=x && zerocount==0){
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
    
  }
}