import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int xor=0;
    for(int i=0;i<n;i++){
      int x=sc.nextInt();
      xor^=x;
    }
    if(xor==0){
      System.out.println("BALANCED");
    }else{
      System.out.println("UNBALANCED");
    }
  }
}