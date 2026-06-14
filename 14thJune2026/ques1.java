import java.util.*;
public class ques1{
  public static boolean isvalid(String s){
    Stack<Character> stck=new Stack<>();
    for(char ch:s.toCharArray()){
      if(ch=='(' || ch=='[' || ch=='{' || ch=='<'){
        stck.push(ch);
      }else{
        if(stck.isEmpty()){
          return false;
        }
        char top=stck.pop();
        if((ch==')' && top!=')') || 
           (ch==']' && top!='[') || 
           (ch=='}' && top!='{') || 
           (ch=='>' && top!='<')){
          return false;
        }
      }
    }
    return stck.isEmpty();
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLint().trim();
    if(isvalid(s)){
      System.out.println("VALID");
    }else{
      System.out.println("INVALID");
    }
  }
}