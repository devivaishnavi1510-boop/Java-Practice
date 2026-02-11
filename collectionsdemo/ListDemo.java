package collectionsdemo;
import java.util.ArrayList;
public class ListDemo {
    public void showList(){
        ArrayList<String>list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("ArrayList");
        for(String s: list){
            System.out.println(s);
        }
    }
    
}
