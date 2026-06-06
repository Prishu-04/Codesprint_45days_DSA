import java.util.*;
public class ques2{
  static class Node{
    int data;
    int npx;
    Node(int data){
      this.data=data;
      this.npx=0;
    }
  }
  static class xorll{
    ArrayList<Node> list=new ArrayList<>();
    int xor(int a,int b){
      return a^b;
    }
    void insert(int data){
      Node curr=new Node(data);
      list.add(curr);
      int idx=list.size();
      if(idx==1){
        return;
      }
      int previdx=idx-1;
      Node prev=list.get(previdx-1);
      int prevprevidx=prev.npx;
      prev.npx=xor(prevprevidx,idx);
      curr.npx=previdx;
    }
    void printlist(){
      int prev=0;
      int curr=1;
      while(curr!=0){
        Node currnode=list.get(curr-1);
        System.out.print(currnode.data+" ");
        int next=xor(prev,currnode.npx);
        prev=curr;
        curr=next;
      }
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    xorll xorlist=new xorll();
    for(int i=0;i<n;i++){
      int val=sc.nextInt();
      xorlist.insert(val);
    }
    xorlist.printlist();
    sc.close();
  }
}