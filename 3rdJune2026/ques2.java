import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
public class ques2{
  public static Node remove(Node head, int k){
    Node temp=new Node(0);
    temp.next=head;
    Node fast=temp;
    Node slow=temp;
    for(int i=0;i<k;i++){
      fast=fast.next;
    }
    while(fast!=null){
      fast=fast.next;
      slow=slow.next;
    }
    slow.next=slow.next.next;
    return temp.next;
  }
  public static void printlist(Node head){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data);
      if(temp.next!=null){
        System.out.print(" ");
      }
      temp=temp.next;
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Node head=null;
    Node tail=null;
    for(int i=0;i<n;i++){
      int val=sc.nextInt();
      Node curr=new Node(val);
      if(head==null){
        head=curr;
        tail=curr;
      }else{
        tail.next=curr;
        tail=curr;
      }
    }
    int k=sc.nextInt();
    head=remove(head,k);
    printlist(head);
  }
}