package class29;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> grocieries=new HashMap<>();
        grocieries.put("Eggs",10);
        grocieries.put("oil",50);
        grocieries.put("Milk",5);
        grocieries.put("Bresd",5);
        grocieries.put("Rice",6);
        grocieries.put("Meat",7);
        grocieries.put("Karaly",5);
        System.out.println(grocieries.get("Rice"));
        System.out.println(grocieries);
    }
}
