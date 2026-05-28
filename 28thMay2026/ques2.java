import java.util.*;
public class ques2{
    static class Part{
      String name;
      int score;
      Part(String name, int score){
        this.name=name;
        this.score=score;
      }
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      Part[] arr=new Part[n];
      for(int i=0;i<n;i++){
        String name=sc.nextLine();
        int score=sc.nextInt();
        sc.nextLine();
        arr[i]=new Part(name,score);
      }
      for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
          if (arr[j].score<arr[j+1].score){
            Part temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
        }
      }
      for(int i=0;i<n;i++){
        System.out.println(arr[i].name+" "+arr[i].score);
      }
    }
}