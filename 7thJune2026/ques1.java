import java.util.*;
public class ques1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
      String s=sc.nextLine();
      String[] arr=s.split(" ");
      for(int j=0;j<arr.length;j++){
        list.add(Integer.parseInt(arr[j]));
      }
    }
    Collections.sort(list);
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i));
      if(i!=list.size()-1){
        System.out.print(" ");
      }
    }
  }
}