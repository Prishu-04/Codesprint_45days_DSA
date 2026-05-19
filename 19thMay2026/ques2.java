import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    System.out.print("Amounts = ");
    int amt[]=new int[n];
    for(int i=0;i<n;i++){
      amt[i]=sc.nextInt();
    }
    int max=Integer.MIN_VALUE;
    int max2=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(max<amt[i]){
        max2=max;
        max=amt[i];
      }else if(max2<amt[i] && max!=amt[i]){
        max2=amt[i];
      }
    }
    System.out.println(max);
    System.out.println(max2);
  }
}