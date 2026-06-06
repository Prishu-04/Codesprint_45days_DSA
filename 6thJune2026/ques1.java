import java.util.*;
public class ques1{
  static class Node{
    int key;
    int value;
    Node prev;
    Node next;
    Node(int key, int value){
      this.key=key;
      this.value=value;
    }
  }
  static class LRUcache{
    int cap;
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    LRUcache(int cap){
      this.cap=cap;
      map=new HashMap<>();
      head=new Node(-1,-1);
      tail=new Node(-1,-1);
      head.next=tail;
      tail.prev=head;
    }
    public int get(int key){
      if(!map.containsKey(key)){
        return -1;
      }
      Node node=map.get(key);
      remove(node);
      insertafterhead(node);
      return node.value;
    }
    public void put(int key,int value){
      if(map.containsKey(key)){
        Node ptr=map.get(key);
        remove(ptr);
        map.remove(key);
      }
      if(map.size()==cap){
        Node lru=tail.prev;
        remove(lru);
        map.remove(lru.key);
      }
      Node curr=new Node(key,value);
      insertafterhead(curr);
      map.put(key,curr);
    }
    private void remove(Node node){
      Node ptr1=node.prev;
      Node ptr2=node.next;
      ptr1.next=ptr2;
      ptr2.prev=ptr1;
    }
    private void insertafterhead(Node node){
      Node ptr1=head.next;
      head.next=node;
      node.prev=head;
      node.next=ptr1;
      ptr1.prev=node;
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int cap=sc.nextInt();
    int n=sc.nextInt();
    LRUcache cache=new LRUcache(cap);
    for(int i=0;i<n;i++){
      String operation=sc.nextLine();
      if(operation.equals("PUT")){
        int key=sc.nextInt();
        int value=sc.nextInt();
        cache.put(key,value);
      }else if(operation.equals("GET")){
        int key=sc.nextInt();
        System.out.println(cache.get(key));
      }
    }
    sc.close();
  }
}