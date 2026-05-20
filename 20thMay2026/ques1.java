import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    System.out.print("Codes = ");
    int code[]=new int[n];
    for(int i=0;i<n;i++){
      code[i]=sc.nextInt();
    }
    int f=0,i;
    for(i=1;i<n;i++){
      if(code[i]==code[i-1]){
        f++;
        break;
      }
    }
    if(f==0){
      System.out.println("VALID");
    }else{
      System.out.println("INVALID "+i);
    }
  }
}