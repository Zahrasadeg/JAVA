package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> studentmap=new HashMap<>();
        studentmap.put(1,"nazir");
        studentmap.put(2,"ali");
        studentmap.put(3,"reza");
        studentmap.put(4,"safi");
        studentmap.put(5,"sara");
        studentmap.put(6,"hiral");
        studentmap.put(7,"saba");
        Collection<String> value=studentmap.values();
        System.out.println(value);
        //remove value witch contain the letter i
        value.removeIf(x->x.contains("i"));
        System.out.println(value);
        System.out.println(studentmap);
        studentmap.replace(3,"ali","zafar");
    }
}
