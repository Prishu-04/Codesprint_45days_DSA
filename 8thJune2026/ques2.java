import java.util.*;
public class ques2{
  public static void mergesort(int[] arr,int low, int high){
    if(low>=high){
      return;
    }
    int mid=low+(high-low)/2;
    mergesort(arr,low,mid);
    mergesort(arr,mid+1,high);
    merge(arr,low,mid,high);
  }
  public static void merge(int[]arr,int low,int mid,int high){
    int[] temp=new int[high=low+1];
    int left=low;
    int right=mid+1;
    int idx=0;
    while(left<=mid && right<=high){
      if(arr[left]<=arr[right]){
        temp[idx]=arr[left++];
      }else{
        temp[idx]=arr[right++];
      }
      idx++;
    }
    while(left<=mid){
      temp[idx++]=arr[left++];
    }
    while(right<=high){
      temp[idx++]=arr[right++];
    }
    for(int i=0;i<temp.length;i++){
      arr[low+i]=temp[i];
    }
  } 
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    mergesort(arr,0,n-1);
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
      if(i<n-1){
        System.out.println(" ");
      }
    }
  }
}