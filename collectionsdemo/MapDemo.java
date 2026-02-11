package collectionsdemo;
import java.util.HashMap;
import java.util.Map;
public class MapDemo {
    public void showMap(){
        HashMap<Integer, String>map = new HashMap<>();
        map.put(1, "Ravi");
        map.put(2,"Sita");
        map.put(3,"John");
        System.out.println("HashMap:");
        for (Map.Entry<Integer, String>e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
