package collectionsdemo;

public class MainApp {
    public static void main(String[] args){
        ListDemo l = new ListDemo();
        SetDemo s = new SetDemo();
        MapDemo m = new MapDemo();
        QueueDemo q = new QueueDemo();
        l.showList();
        System.out.println();
        s.showSet();
        System.out.println();
        m.showMap();
        System.out.println();
        q.showQueue();
    } 
}