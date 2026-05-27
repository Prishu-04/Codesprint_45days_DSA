import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print("K = ");
    int k=sc.nextInt();
    Arrays.sort(arr);
    Boolean f=false;
    for(int i=0;i<n;i++){
      int l=i+1,r=n-1;
      while(l<r){
        int sum=arr[i]+arr[l]+arr[r];
        if(sum==k){
          f=true;
          break;
        }else if(sum<k){
          l++;
        }else{
          r--;
        }
      }
      if(f){
        break;
      }
    }
    if(f){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}