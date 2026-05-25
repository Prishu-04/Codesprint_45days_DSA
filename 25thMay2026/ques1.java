import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int roll=sc.nextInt();
      int count=Integer.bitCount(roll);
      if(count%2==1){
        System.out.println("ANSWER");
      }else{
        System.out.println("SAFE");
      }
    }
  }
}