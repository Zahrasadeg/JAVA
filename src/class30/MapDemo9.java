package class30;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo9 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");
        var values=countries.values();
        for(var value:values){
            System.out.println(value);
        }
    }
}
