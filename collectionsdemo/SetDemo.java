package collectionsdemo;
import java.util.HashSet;
public class SetDemo {
    public void showSet(){
        HashSet<Integer>set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("HashSet:");
        for (int i:set){
            System.out.println(i);
        }
    }
    
}
