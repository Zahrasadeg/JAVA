package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> studentmap=new HashMap<>();
        studentmap.put(1,"nazir");
        studentmap.put(2,"ali");
        studentmap.put(3,"reza");
        studentmap.put(4,"safi");
        studentmap.put(5,"sara");
        studentmap.put(6,"hiral");
        studentmap.put(7,"saba");
        //remove grater than 2
        Set<Integer>key=studentmap.keySet();
        System.out.println(key);
        key.removeIf(x->x>2);
        System.out.println(key);
    }
}
