import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String pass=sc.nextLine();
    boolean u=false;
    boolean v=false;
    boolean d=false;
    for(int i=0;i<pass.length();i++){
      char ch=pass.charAt(i);
      if(Character.isUpperCase(ch)){
        u=true;
      }else if(Character.isLowerCase(ch)){
        v=true;
      }else if(Character.isDigit(ch)){
        d=true;
      }
    }
    if(u && v && d){
      System.out.println("STRONG");
    }else{
      System.out.println("WEAK");
    }
  }
}