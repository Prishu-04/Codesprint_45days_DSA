import java.util.*;
public class ques1{
  static int countvow(String s){
    int count=0;
    s=s.toLowerCase();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        count++;
      }
    }
    return count++;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] username=new String[n];
    for(int i=0;i<n;i++){
      username[i]=sc.nextLine();
    }
    Arrays.sort(username,new Comparator<String>(){
      public int compare(String a, String b){
        int vowa=countvow(a);
        int vowb=countvow(b);
        if(vowa!=vowb){
          return vowb-vowa;
        }
        if(a.length()!=b.length()){
          return a.length()-b.length();
        }
        return a.compareTo(b);
      }
    });
    for(int i=0;i<n;i++){
      System.out.println(username[i]);
    }
  }
}