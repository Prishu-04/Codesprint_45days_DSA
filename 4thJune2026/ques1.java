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
  public static boolean hascycle(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int pos=sc.nextInt();
    Node head=new Node(arr[0]);
    Node curr=head;
    Node cycle=null;
    if(pos==0){
      cycle=head;
    }
    for(int i=0;i<n;i++){
      Node ptr=new Node(arr[i]);
      curr.next=ptr;
      curr=ptr;
      if(i==pos){
        cycle=ptr;
      }
    }
    if(pos!=-1){
      curr.next=cycle;
    }
    if(hascycle(head)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    sc.close();

  }
}