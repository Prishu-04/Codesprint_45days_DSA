  import java.util.*;
  public class ques1{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("N = ");
      int n=sc.nextInt();
      System.out.print("Scores = ");
      int[] score=new int[n];
      for(int i=0;i<n;i++){
        score[i]=sc.nextInt();
      }
      int sum=0,avg=0;
      for(int i=0;i<n;i++){
        sum=sum+score[i];
      }
      avg=sum/n;
      int c=0;
      for(int i=0;i<n;i++){
        if(avg<score[i]){
          c++;
        }
      }
      System.out.println(c);
    }
  }