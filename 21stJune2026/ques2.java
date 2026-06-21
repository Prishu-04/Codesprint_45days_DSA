import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int l=0,r=n-1,count=0;
    while(l<r){
      int sum=arr[l]+arr[r];
      if(sum==x){
        count++;
        int a=arr[l];
        int b=arr[r];
        while(l<r && arr[l]==a){
          l++;
        }while(l<r && arr[r]==b){
          r--;
        }
      }else if(sum<x){
        l++;
      }else{
        r--;
      }
    }
    System.out.println(count);
  }
}