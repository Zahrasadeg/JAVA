package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        Map<Integer,String> studentmap=new HashMap<>();
        studentmap.put(1,"nazir");
        studentmap.put(2,"ali");
        studentmap.put(3,"reza");
        studentmap.put(4,"safi");
        studentmap.put(5,"sara");
        studentmap.put(6,"hiral");
        studentmap.put(7,"saba");
        Set<Entry<Integer,String>>entrySet=studentmap.entrySet();
        for (Entry<Integer,String >entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        entrySet.removeIf(x->x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(studentmap);

    }
}
