import java.util.*;
import java.io.*;
public class ques1{
  public static long eval(String s){
    Stack<Long> stck=new Stack<>();
    long num=0;
    char op='+';
    for(int i=0;i<=s.length();i++){
      char ch=(i<s.length())?s.charAt(i):'+';
      if((Character.isDigit(ch) && ch!=' ') || i==s.length()){
        if(op=='+'){
          stck.push(num);
        }else if(op=='-'){
          stck.push(-num);
        }else if(op=='*'){
          stck.push(stck.pop()*num);
        }else if(op=='/'){
          stck.push(stck.pop()/num);
        }
        op=ch;
        num=0;
      }
    }
    long res=0;
    while(!stck.isEmpty()){
      res+=stck.pop();
    }
    return res;
  }
  public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String exp=br.readLine();
    System.out.println(eval(exp));
  }
}