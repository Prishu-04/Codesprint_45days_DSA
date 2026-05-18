import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    System.out.print("Marks = ");
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int flag=0;
    for(int i=1;i<n;i++){
      if(arr[i]==arr[i-1]){
        flag++;
        break;
      }
    }
    if(flag==0){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}