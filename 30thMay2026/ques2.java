import java.util.*;
public class ques2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] words=s.trim().split("\\s+");
    StringBuilder res=new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
      res.append(words[i]);
      if(i!=0){
        res.append(" ");
      }
    }
    System.out.println(res.toString());
  }
}