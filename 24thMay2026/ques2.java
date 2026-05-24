import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char[] sa=str.toCharArray();
    int count=1;
    int n=sa.length;
    for(int i=1;i<=n;i++){
      if(i<n && sa[i]==sa[i-1]){
        count++;
      }else{
        System.out.print(sa[i-1]+""+count);
        count=1;
      }
    }
    sc.close();
  }
}