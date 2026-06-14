import java.util.*;
public class ques2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int q=Integer.parseint(sc.nextLine().trim());
    Queue<Integer> queue=new LinkedList<>();
    for(int i=0;i<q;i++){
      String op=sc.nextLine().trim();
      if(op.startsWith("REGISTER")){
        String[] part=op.split("\\s+");
        int stuid=Integer.parseInt(part[1]);
        queue.offer(stuid);
      }else if(op.equals("WITHDRAW")){
        if(!queue.isEmpty()){
          queue.poll();
        }
      }else if(op.equals("NEXT")){
        if(queue.isEmpty()){
          System.out.println(-1);
        }else{
          System.out.println(queue.poll());
        }
      }
    }
    sc.close();
  }
}