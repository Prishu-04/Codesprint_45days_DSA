import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    long prefixsum=0;
    int count=0,i=0;
    while(i<n){
      long curr=arr[i];
      if(prefixsum>=k){
        int j=i;
        while(j<n && arr[j]==curr){
          count++;j++;
        }
        while(i<n && arr[i]==curr){
          prefixsum+=arr[i];
          i++;
        }
      }
      System.out.println(count);
    }
  }
}