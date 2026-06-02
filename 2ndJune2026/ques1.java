import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("jewels = ");
    String jewels=sc.next();
    System.out.print("stones = ");
    String stone=sc.next();
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<jewels.length();i++){
      set.add(jewels.charAt(i));
    }
    int count=0;
    for(int i=0;i<stone.length();i++){
      if(set.contains(stone.charAt(i))){
        count++;
      }
    }
    System.out.println(count);
  }
}