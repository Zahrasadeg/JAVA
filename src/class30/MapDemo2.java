package class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lpistick",50.0);
        makeup.put("foundation",20.0);
        makeup.put("maskara",60.0);
        makeup.put("eyeliner",30.0);
        makeup.put("blushon",90.0);
        Set<String>allkeys=makeup.keySet();
        System.out.println(allkeys);
        allkeys.removeIf(x->x.length()>7);
        System.out.println(allkeys);
        System.out.println(makeup);
       // allkeys.remove("maskara");
       // System.out.println(allkeys);


    }
}
