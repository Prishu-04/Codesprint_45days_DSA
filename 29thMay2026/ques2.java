import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("S = ");
    String s=sc.nextLine();
    String lg="";
    for(int i=0;i<s.length();i++){
      int left=i;
      int right=i;
      while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
        if((right-left+1)>lg.length()){
          lg=s.substring(left,right+1);
        }
        left--;
        right++;
      }
      left=i;
      right=i+1;
      while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
        if((right-left+1)>lg.length()){
          lg=s.substring(left,right+1);
        }
        left--;
        right++;
      }
    }
    System.out.println(lg);
  }
}