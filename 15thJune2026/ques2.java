import java.util.*;
import java.io.*;
public class ques2{
  public static String cleancap(String s){
    StringBuilder stck=new StringBuilder();
    for(char ch:s.toCharArray()){
      int size=stck.length();
      if(size>0 && stck.charAt(size-1)==ch){
        stck.deleteCharAt(size-1);
      }else{
        stck.append(ch);
      }
    }
    return stck.length()==0?"EMPTY":stck.toString();
  }
  public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    System.out.println(cleancap(s));
  }
}