import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    char[] sa1=s1.toCharArray();
    char[] sa2=s2.toCharArray();
    if(sa1.length!=sa2.length){
      System.out.println("NO");
    }
    int[] count=new int[26];
    for(int i=0;i<sa1.length;i++){
      count[sa1[i]-'a']++;
      count[sa2[i]-'a']--;
    }
    boolean isAnagram=true;
    for(int i=0;i<26;i++){
      if(count[i]!=0){
        isAnagram=false;
        break;
      }
    }
    if(isAnagram){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    sc.close();
  }
}