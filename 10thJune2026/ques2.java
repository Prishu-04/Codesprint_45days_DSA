import java.util.*;
public class ques2{
  static class node{
    int data;
    node next;
    node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static int findmid(node h){
    node slow=h;node fast=h;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow.data;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    node head=null;node tail=null;
    for(int i=0;i<n;i++){
      int val=sc.nextInt();
      node curr=new node(val);
      if(head==null){
        head=tail=curr;
      }else{
        tail.next=curr;
        tail=curr;
      }
    }
    System.out.println(findmid(head));
  }
}