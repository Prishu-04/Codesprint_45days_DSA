import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    sc.nextLine();
    String first=sc.nextLine();
    String prefix=first;
    for(int i=1;i<n;i++){
      String str=sc.nextLine();
      int j;
      for(j=0;j<Math.min(prefix.length(),str.length());j++){
        if(prefix.charAt(j)!=str.charAt(j)){
          break;
        }
      }
      prefix=prefix.substring(0,j);
    }
    System.out.print(prefix);
  }
}