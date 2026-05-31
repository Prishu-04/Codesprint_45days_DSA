import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int swap=0;
    for(int i=0;i<n-1;i++){
      int minidx=i;
      for(int j=i+1;j<n;j++){
        if(arr[j]<arr[minidx]){
          minidx=j;
        }
      }
      if(minidx!=i){
        int temp=arr[i];
        arr[i]=arr[minidx];
        arr[minidx]=temp;
        swap++;
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println(swap);
  }
}