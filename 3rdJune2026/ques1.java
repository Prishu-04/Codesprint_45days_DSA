import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
public class ques1{
  public static Node reverselist(Node head){
    Node prev=null;
    Node curr=head;
    Node nextnode=null;
    while(curr!=null){
      nextnode=curr.next;
      curr.next=prev;
      prev=curr;
      curr=nextnode;
    }
    return prev;
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
    if(n==0){
      return;
    }
    Node head=new Node(sc.nextInt());
    Node tail=head;
    for(int i=1;i<n;i++){
      Node curr=new Node(sc.nextInt());
      tail.next=curr;
      tail=curr;
    }
    head=reverselist(head);
    printlist(head);
  }
}