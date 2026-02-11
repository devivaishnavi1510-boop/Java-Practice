package collectionsdemo;
import java.util.PriorityQueue;
public class QueueDemo {
    public QueueDemo(){}

    public void showQueue(){
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Red");
        q.add("Blue");
        q.add("Green");
        System.out.println("PriorityQueue:");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}