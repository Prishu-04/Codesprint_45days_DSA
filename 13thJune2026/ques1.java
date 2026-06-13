import java.util.*;
public class ques1{
  public static int findpeak(int[] arr){
    int l=0,r=arr.length-1;
    while(l<r){
      int mid=l+(r-l)/2;
      if(arr[mid]<arr[mid+1]){
        l=mid+1;
      }else{
        r=mid;
      }
    }
    return arr[l];
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] signalstrength=new int[n];
    for(int i=0;i<n;i++){
      signalstrength[i]=sc.nextInt();
    }
    System.out.println(findpeak(signalstrength));
    sc.close();
  }
}