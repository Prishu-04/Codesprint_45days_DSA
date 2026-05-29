import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("N = ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int left=0,right=n-1,a=0,b=0,minsum=Integer.MAX_VALUE;
    while(left<right){
      int sum=arr[left]+arr[right];
      if(Math.abs(sum)<Math.abs(minsum)){
        minsum=sum;
        a=arr[left];
        b=arr[right];
      }
      if(sum<0){
        left++;
      }else{
        right--;
      }
    }
    System.out.println(a+" "+b);
  }
}