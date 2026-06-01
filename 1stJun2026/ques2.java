import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int l=0,r=n-1,maxload=0;
    while(l<r){
      int currload=arr[l]+arr[r];
      maxload=Math.max(maxload,currload);
      l++;r--;
    }
    System.out.println(maxload);
  }
}