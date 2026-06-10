import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long w=sc.nextLong();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int l=0,sum=0,maxlen=0;
    for(int r=0;r<n;r++){
      sum+=arr[r];
      while(sum>n){
        sum-=arr[l];
        l++;
      }
      maxlen=Math.max(maxlen,r-l+1);
    }
    System.out.println(maxlen);
  }
}