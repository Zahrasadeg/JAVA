package class29;

import java.util.LinkedHashSet;

public class setCities {
    public static void main(String[] args) {
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("KAbul");
        cities.add("Tehran");
        cities.add("Washington");
        cities.add("Berlin");
        cities.add("Alexanderia");
        cities.add("fairfax");
        cities.removeIf(city->city.startsWith("A"));
        System.out.println(cities);
    }
}
