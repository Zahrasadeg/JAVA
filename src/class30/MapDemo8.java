package class30;

import java.util.TreeMap;

public class MapDemo8 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");
        var entrySet=countries.entrySet();
        for(var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        var iterator =countries.entrySet().iterator();
        while (iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
