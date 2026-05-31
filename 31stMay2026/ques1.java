import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int left=0,right=n-1,maxsc=0;
    while(left<right){
      int minht=Math.min(arr[left],arr[right]);
      int dist=right-left;
      int score=minht*dist;
      maxsc=Math.max(maxsc,score);
      if(arr[left]<arr[right]){
        left++;
      }else{
        right--;
      }
    }
    System.out.println(maxsc);
  }
}