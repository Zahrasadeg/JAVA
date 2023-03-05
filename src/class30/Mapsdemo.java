package class30;

import java.util.HashMap;

public class Mapsdemo {
    public static void main(String[] args) {
        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("pip",5.67);
        fruit.put("banana",6.9);
        fruit.put("kiwi",3.99);
        fruit.put(null,null);
        System.out.println(fruit);
        HashMap<String,Double>makeup=new HashMap<>();
        makeup.put("Lpistick",50.0);
        makeup.put("foundation",20.0);
        makeup.put("maskara",60.0);
        makeup.put("eyeliner",30.0);
        makeup.put("blushon",90.0);

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);
    }
}
